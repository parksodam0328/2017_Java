package char_base;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileExam {

	public static void main(String[] args) {
		char buffer[] = new char[100];
		try{
			FileReader fr = new FileReader("datar.txt");
			FileWriter fw = new FileWriter("dataw.txt"); 
			fr.read(buffer,0,100);
			String str = new String(buffer);
			System.out.println(str); // ȭ�鿡 �����ֱ�
			fw.write(buffer); //���Ϸ� �����ֱ�
			fw.flush();
		}catch(IOException e){
			System.out.println(e.toString());
		}
	}

}
