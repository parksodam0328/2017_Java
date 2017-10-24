package char_base;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class QuitTest {

	public static void main(String[] args) {
		try{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		FileWriter fw = new FileWriter("quittest.txt");
		while(true){
		String a = br.readLine();
		if(a.compareToIgnoreCase("q")==)break;
		fw.write(a);
		fw.flush();
		System.out.println(a);
		}
		}catch(IOException e){}
	}

}
