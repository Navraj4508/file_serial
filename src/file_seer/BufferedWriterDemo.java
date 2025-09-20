package file_seer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileWriter fw =new FileWriter("D:\\File\\abc.txt");
		BufferedWriter bw = new BufferedWriter(fw); 
		bw.write(100);
		bw.newLine();
		char[] ch = {'a','b','c','d'};
		bw.write(ch);
		bw.newLine();
		bw.write("sai charan");
		bw.newLine();
		bw.write("navraj kumar");
		bw.newLine();
		
		//bw.flush();
		bw.close();

	}

}
