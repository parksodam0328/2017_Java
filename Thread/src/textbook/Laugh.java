package textbook;

class SendMassage implements Runnable{
	String massage;

	public SendMassage(String massage) {
		super();
		this.massage = massage;
	}
	public void say(){
		System.out.print(massage+" ");
	}
	public void sayNtimes(int n) throws InterruptedException{
		for(int i=0;i<n;i++){
			say();
			Thread.sleep(1000);
		}
	}
	public void run(){
		try {
			sayNtimes(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

public class Laugh {

	public static void main(String[] args) {
		//s1 thread와 s2 thread가 경쟁하고 있다.
		//스레드의 실행 시간과 순서를 thread scheduler가 관리하기 때문이다!
		Thread t1 = new Thread(new SendMassage("Ha")); 
		Thread t2 = new Thread(new SendMassage("Ho"));
		t1.start(); //run() 호출시 스레드가 아니다. 형태만 스레드로 갖췄지, 실제로는 스레드가 아니다!
		t2.start();
	}

}
