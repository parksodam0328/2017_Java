package string_test;

public class StringEx3 {

	public static void main(String[] args) {
		char ch='A';
		String str1 = "A";
		String str2; // 선언
		str2 = String.valueOf(ch);
		System.out.println(str1+str2); // 그냥 출력만 하는 것
		if(str1==str2){ //참조
			System.out.println("같다");
		}else{
			System.out.println("다르다");
		}
		if(str1.equals(str2)){ //값
			System.out.println("같다");
		}else{
			System.out.println("다르다");
		}
	}
}
