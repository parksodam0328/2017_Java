package textbook;


class DerivedThread extends Thread{
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
	
public class Thread2Exam {

	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		DerivedThread d1 = new DerivedThread();
		DerivedThread d2 = new DerivedThread();
		d1.start();
		d2.start();
		System.out.println("프로그램 종료");

	}

}
