package wrapper;

public class Exception_Equals_test {
//������ ���ܴ� �ٸ���. ���ܴ� �������� �ǳ� ������ ���� �ʴ� ���̴�!
	public static void main(String[] args) {
		try{//���ܰ� ���� ���
			Integer i1 = new Integer("10");
			Integer i2 = new Integer("10.0");
		
			if(i1.equals(i2)){ //�� �� �������̵�
			System.out.println("���� �����ϴ�.");
			}else {
			System.out.println("���� �ٸ��ϴ�.");
			}
		}catch(NumberFormatException e){ //����ó�� 
			System.out.println("���� ������ Ʋ���ϴ�.");
		}

	}

}
