package string_test;

public class StringEx3 {

	public static void main(String[] args) {
		char ch='A';
		String str1 = "A";
		String str2; // ����
		str2 = String.valueOf(ch);
		System.out.println(str1+str2); // �׳� ��¸� �ϴ� ��
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
	}
}
