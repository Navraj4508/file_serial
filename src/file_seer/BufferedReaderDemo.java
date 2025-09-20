package file_seer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedReaderDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader fw =new FileReader("D:\\File\\abc.txt");
		BufferedReader br = new BufferedReader(fw);
		
		String line= br.readLine();
		while(line !=  null) {
			System.out.println(line);
			line = br.readLine();
		}
		br.close();
		

	}

}



