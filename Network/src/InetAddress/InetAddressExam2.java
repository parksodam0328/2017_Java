package InetAddress;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressExam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			InetAddress ia = InetAddress.getByName("java.sun.com");
			System.out.println("IP 주소 : "+ia.getHostAddress());
			System.out.println("도메인 이름 : "+ia.getHostName());
		}catch(UnknownHostException e){
			e.printStackTrace();
		}
	}

}
