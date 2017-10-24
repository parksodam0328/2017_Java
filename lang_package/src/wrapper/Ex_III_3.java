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
		System.out.println("0과 100사이의 임의의 정수를 맞추는 프로그램");//System.out.println(number);
		int cnt=0;
		int input;
		Scanner scan = new Scanner(System.in);
		do{
			System.out.println("숫자 입력(0~99)? ");
			input = scan.nextInt();
			if(input == number){
				System.out.println("정답입니다.("+cnt+"회) ***축하합니다***");
				return;
			}
			else if(input>number){
				++cnt;
				System.out.println("너무큽니다.("+cnt+"회)");
			}
			else{
				++cnt;
				System.out.println("너무작습니다.("+cnt+"회)");
			}
		}while(cnt<7);
		System.out.println("**************");
		System.out.println("게임 over");
	}
}
public class Ex_III_3 {

	public static void main(String[] args) {
		EqualsNumber e = new EqualsNumber();
		Random r = new Random();
		r.RandomNumber(e);
	}
}
