package UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPServerExam {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		DatagramSocket ds = new DatagramSocket(2000);
		byte[] data = new byte[65508];
		
		DatagramPacket dp = new DatagramPacket(data, data.length);
		System.out.println("UDP���� �����");
		
		ds.receive(dp);
		String msg = new String(dp.getData()).trim();
		
		System.out.println("���� �ּ� : "+dp.getAddress());
		System.out.println("���� �޼��� : "+msg);
	}

}
