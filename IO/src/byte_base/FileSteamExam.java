package byte_base;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
public class FileSteamExam {

	public static void main(String[] args) throws IOException {
		byte []b=new byte[1024];
		FileInputStream fis = new FileInputStream("tin.txt");
		FileOutputStream fos = new FileOutputStream("tout.txt");
		fis.read(b);
		fos.write(b);
		fis.close();
		fos.close();
	}

}
