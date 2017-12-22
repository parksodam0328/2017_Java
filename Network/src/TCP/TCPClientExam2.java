package TCP;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPClientExam2 {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InetAddress ia = InetAddress.getByName("127.0.0.1");
		Socket so = new Socket(ia,60);
		BufferedReader br = new BufferedReader(new InputStreamReader(so.getInputStream()));
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(so.getOutputStream()));
		
		while(true){
		System.out.println("보낼 메세지 : ");
		String send_msg = in.readLine();
		bw.write(send_msg+"\n");
		bw.flush();
		
		System.out.println(">>>>>>>서버 메세지를 기다리는 중<<<<<");
		String get_msg=br.readLine();
		
		System.out.println("보낸 주소 : "+so.getInetAddress());
		System.out.println("보낸 내용 : "+get_msg);
		if(get_msg.equals("exit")){
		so.close();
		bw.close();
		System.exit(0);
		}
		}
	}

}
