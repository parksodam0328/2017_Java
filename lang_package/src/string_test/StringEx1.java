package string_test;

public class StringEx1 {

	public static void main(String[] args) {
		String str1="abc"; // 리터럴 상수
		String str2="abc"; // 리터럴 상수
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
		String str3 = new String("abc");
		String str4 = new String("abc");
		if(str3==str4){ //참조
			System.out.println("같다");
		}else{
			System.out.println("다르다");
		}
		if(str3.equals(str4)){ //값
			System.out.println("같다");
		}else{
			System.out.println("다르다");
		}
	}
}
