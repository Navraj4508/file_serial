package file_seer;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileWriter fw = new FileWriter("D:\\File\\P1\\na.txt",true);
		fw.write(99);
		fw.write("navraj\nJava Developer");
		fw.write("\n");
		
		char[] ch = {'a','b','c'};
		fw.write(ch);
		fw.write("\n");
		fw.flush();
		fw.close();
		

	}

}
