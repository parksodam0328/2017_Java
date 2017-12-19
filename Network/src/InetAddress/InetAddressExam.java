package InetAddress;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			InetAddress ia = InetAddress.getLocalHost(); // 지역호스트의 주소 반환 - static 메소드
			System.out.println("IP 주소 : "+ ia.getHostAddress()); // 호스트의 IP 주소 반환 - static 메소드
		}catch(UnknownHostException e){
			e.printStackTrace();
		}
	}

}
