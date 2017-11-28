package char_base;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderExam {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try{
			String aa = br.readLine();
			System.out.println(aa);
		}catch(IOException ie){}

	}

}
