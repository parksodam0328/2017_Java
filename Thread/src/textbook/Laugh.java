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
		//s1 thread�� s2 thread�� �����ϰ� �ִ�.
		//�������� ���� �ð��� ������ thread scheduler�� �����ϱ� �����̴�!
		Thread t1 = new Thread(new SendMassage("Ha")); 
		Thread t2 = new Thread(new SendMassage("Ho"));
		t1.start(); //run() ȣ��� �����尡 �ƴϴ�. ���¸� ������� ������, �����δ� �����尡 �ƴϴ�!
		t2.start();
	}

}
