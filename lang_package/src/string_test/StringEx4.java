package string_test;
//�Է¹��� ���� -> �ѱ��ھ� ������
class NumToString{
	public static void translate(int number){ // Static �޼ҵ��̱� ������ Ŭ���� �̸����� ����
		String str1 = String.valueOf(number); //String ��ȯ
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
