package textbook;

class TopExam implements Runnable{
	public void run() {
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

public class Runnable1Exam {

	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		Thread t = new Thread(new TopExam());
		t.start();
		System.out.println("프로그램 종료");

	}

}
