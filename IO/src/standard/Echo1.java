package standard;

import java.io.IOException;

public class Echo1 {

	public static void main(String args[]) throws IOException{
		
		int bt=System.in.read(); // 한글 안먹음, 한글 지원을 안함
		System.out.println((char)bt);
	}
}
