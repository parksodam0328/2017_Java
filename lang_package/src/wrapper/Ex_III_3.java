package wrapper;
import java.util.Scanner;
class Random{
	public void RandomNumber(EqualsNumber e){
	int ran = (int)(Math.random()*100);
	e.FindOutEqualsNumber(ran);
	
	}
}
class EqualsNumber{
	public void FindOutEqualsNumber(int number){
		System.out.println("0�� 100������ ������ ������ ���ߴ� ���α׷�");//System.out.println(number);
		int cnt=0;
		int input;
		Scanner scan = new Scanner(System.in);
		do{
			System.out.println("���� �Է�(0~99)? ");
			input = scan.nextInt();
			if(input == number){
				System.out.println("�����Դϴ�.("+cnt+"ȸ) ***�����մϴ�***");
				return;
			}
			else if(input>number){
				++cnt;
				System.out.println("�ʹ�Ů�ϴ�.("+cnt+"ȸ)");
			}
			else{
				++cnt;
				System.out.println("�ʹ��۽��ϴ�.("+cnt+"ȸ)");
			}
		}while(cnt<7);
		System.out.println("**************");
		System.out.println("���� over");
	}
}
public class Ex_III_3 {

	public static void main(String[] args) {
		EqualsNumber e = new EqualsNumber();
		Random r = new Random();
		r.RandomNumber(e);
	}
}
