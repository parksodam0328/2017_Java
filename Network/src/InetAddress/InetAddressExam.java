package InetAddress;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			InetAddress ia = InetAddress.getLocalHost(); // ����ȣ��Ʈ�� �ּ� ��ȯ - static �޼ҵ�
			System.out.println("IP �ּ� : "+ ia.getHostAddress()); // ȣ��Ʈ�� IP �ּ� ��ȯ - static �޼ҵ�
		}catch(UnknownHostException e){
			e.printStackTrace();
		}
	}

}
