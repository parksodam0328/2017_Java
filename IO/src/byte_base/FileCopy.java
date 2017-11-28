package byte_base;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
public class FileCopy {

	public static void main(String[] args) throws IOException {
		byte []b=new byte[1024];
		FileInputStream fis = new FileInputStream(args[0]);
		FileOutputStream fos = new FileOutputStream(args[1]);
		fis.read(b);
		fos.write(b);
		fis.close();
		fos.close();
	}
}
