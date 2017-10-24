package homework;
class NumToKorean{
	public static void translate(int number){
		String str1 = String.valueOf(number);
		String str2[] = new String[]{"","일","이","삼","사","오","육","칠","팔","구"};
		String str3[] = new String[]{"","십","백","천","만","십","백"};
		int leng = str1.length();
		for(int i=0;i<str1.length();i++){
		if(number <0 || number>9999999){
			System.out.println("잘못입력");
			return; 
		}
		leng--; // 12345를 입력하면 1다음부터 단위를 붙이기 위해서(4부터 단위를 붙임)
		if(str1.charAt(i)!='0'){ //0의 값을 빼지 않으면 공백 천 이 나옴 그래서 0을 빼줌
			System.out.print(str2[str1.charAt(i)-'0']);
			// ex) str1.charAt(2)=='2', '2'-'0'=2, str2[2]='이' 출력 , 정수로 바꿔서 str2의 인덱스 값에 넣음
			System.out.print(str3[leng%7]); // ex) 5%7==5 이 되므로 5번째방 십의 값이 더해짐
		}//end of if
		}// end of for
		System.out.println();
	}
}
public class Homework {
	public static void main(String[] args) {
			NumToKorean.translate(12345);
			NumToKorean.translate(10030);
			NumToKorean.translate(25);
	}
}