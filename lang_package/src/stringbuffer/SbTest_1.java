package stringbuffer;

public class SbTest_1 {

	public static void main(String[] args) {
//		StringBuffer sb1 = new StringBuffer("java");
//		StringBuffer sb2 = new StringBuffer("java");
//		// StringBufferŬ������ Object Ŭ������ �޼ҵ带 �������̵� ���� �ʴ´�.
//		if(sb1==sb2){ //����
//			System.out.println("����");
//		}else{
//			System.out.println("�ٸ���");
//		}
//		if(sb1.equals(sb2)){ //����
//			System.out.println("����");
//		}else{
//			System.out.println("�ٸ���");
//		}
		StringBuffer st = new StringBuffer("��� ��");
		st.setLength(10);
		System.out.println(st);
		st.setCharAt(9,'��');
		System.out.println(st);
		System.out.println(Math.round(3.6));
		System.out.println(Math.round(-21.5));
		System.out.println(Math.round(23.2));
		System.out.println(Math.rint(3.6));
		System.out.println(Math.rint(-21.5));
		System.out.println(Math.rint(23.2));
	}

}
