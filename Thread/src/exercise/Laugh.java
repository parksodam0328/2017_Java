package exercise;

class SendMassage extends Thread{
	String massage;

	public SendMassage(String massage) {
		super();
		this.massage = massage;
	}
	public void say(){
		System.out.print(massage+" ");
	}
	public void sayNtimes(int n){
		for(int i=0;i<n;i++){
			say();
		}
	}
	public void run(){
		sayNtimes(10);
	}
}

public class Laugh {

	public static void main(String[] args) {
		//s1 thread�� s2 thread�� �����ϰ� �ִ�.
		//�������� ���� �ð��� ������ thread scheduler�� �����ϱ� �����̴�!
		SendMassage s1 = new SendMassage("Ha"); 
		SendMassage s2 = new SendMassage("Ho");
		s1.start(); //run() ȣ��� �����尡 �ƴϴ�. ���¸� ������� ������, �����δ� �����尡 �ƴϴ�!
		s2.start();
	}

}
