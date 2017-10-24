package textbook;

class Top extends Thread{
	public void run(){
		int count=0;
		for(int i=0;i<50;i++){
			if(count==10){
				System.out.println();
				count=0;
			}
			System.out.print(i+"\t");
			count++;
		}
	}
}

public class Thread1Exam {

	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		Top d = new Top();
		d.start();
		System.out.println("프로그램 종료");

	}

}
