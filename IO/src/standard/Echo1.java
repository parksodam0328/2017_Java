package standard;

import java.io.IOException;

public class Echo1 {

	public static void main(String args[]) throws IOException{
		
		int bt=System.in.read(); // �ѱ� �ȸ���, �ѱ� ������ ����
		System.out.println((char)bt);
	}
}
