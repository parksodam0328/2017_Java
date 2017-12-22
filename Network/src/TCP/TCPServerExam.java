package TCP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServerExam {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ServerSocket ss = new ServerSocket(6000);
		System.out.println("TCP 서버 대기중");
		Socket so = ss.accept();
		BufferedReader in = new BufferedReader(new InputStreamReader(so.getInputStream()));
		String msg = in.readLine();
		System.out.println("보낸 주소 : "+so.getInetAddress());
		System.out.println("보낸 내용 : "+msg);
		so.close();
	}

}
