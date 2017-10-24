package homework;
class NumToKorean{
	public static void translate(int number){
		String str1 = String.valueOf(number);
		String str2[] = new String[]{"","��","��","��","��","��","��","ĥ","��","��"};
		String str3[] = new String[]{"","��","��","õ","��","��","��"};
		int leng = str1.length();
		for(int i=0;i<str1.length();i++){
		if(number <0 || number>9999999){
			System.out.println("�߸��Է�");
			return; 
		}
		leng--; // 12345�� �Է��ϸ� 1�������� ������ ���̱� ���ؼ�(4���� ������ ����)
		if(str1.charAt(i)!='0'){ //0�� ���� ���� ������ ���� õ �� ���� �׷��� 0�� ����
			System.out.print(str2[str1.charAt(i)-'0']);
			// ex) str1.charAt(2)=='2', '2'-'0'=2, str2[2]='��' ��� , ������ �ٲ㼭 str2�� �ε��� ���� ����
			System.out.print(str3[leng%7]); // ex) 5%7==5 �� �ǹǷ� 5��°�� ���� ���� ������
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