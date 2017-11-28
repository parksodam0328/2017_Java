package string_test;
class NumToKorean{
	public static void translate(int number){
		String str1 = String.valueOf(number);
		char[] data = str1.toCharArray();
		for(int i=0;i<data.length;i++){
			System.out.println("data["+i+"] = "+data[i]);
		}
	}
}
public class Homework {

	public static void main(String[] args) {
			NumToString.translate(12345678);
	}

}
