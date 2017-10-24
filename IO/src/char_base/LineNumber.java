package char_base;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LineNumber {

	public static void main(String[] args) {
		int cnt=1;
		try{
			FileReader fr = new FileReader(args[0]);
			BufferedReader br = new BufferedReader(fr);
			while(br.readLine()!=null){
				String s = br.readLine();
				System.out.println(cnt+" "+s); // 화면에 보여주기
				cnt++;
			}
		}catch(FileNotFoundException fe){
			System.out.println(fe.toString());
		}
		catch(IOException e){
			System.out.println(e.toString());
		}
		
	}

}
