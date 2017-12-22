package TCP;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPClientExam {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InetAddress ia = InetAddress.getByName("127.0.0.1");
		Socket so = new Socket(ia,5000);
		System.out.println("보낼 메세지 : ");
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(so.getOutputStream()));
		String msg = in.readLine();
		bw.write(msg+"\n");
		so.close();
		bw.close();
	}

}
