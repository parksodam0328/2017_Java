package string_test;
//입력받은 숫자 -> 한글자씩 나누기
class NumToString{
	public static void translate(int number){ // Static 메소드이기 때문에 클래스 이름으로 접근
		String str1 = String.valueOf(number); //String 변환
		char[] data = str1.toCharArray();
		for(int i=0;i<data.length;i++){
			System.out.println("data["+i+"] = "+data[i]);
		}
	}
}
public class StringEx4 {
	public static void main(String[] args) {
		NumToString.translate(2513);
	}
}
