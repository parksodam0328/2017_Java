package string_test;

public class StringEx1 {

	public static void main(String[] args) {
		String str1="abc"; // ���ͷ� ���
		String str2="abc"; // ���ͷ� ���
		if(str1==str2){ //����
			System.out.println("����");
		}else{
			System.out.println("�ٸ���");
		}
		if(str1.equals(str2)){ //��
			System.out.println("����");
		}else{
			System.out.println("�ٸ���");
		}
		String str3 = new String("abc");
		String str4 = new String("abc");
		if(str3==str4){ //����
			System.out.println("����");
		}else{
			System.out.println("�ٸ���");
		}
		if(str3.equals(str4)){ //��
			System.out.println("����");
		}else{
			System.out.println("�ٸ���");
		}
	}
}
