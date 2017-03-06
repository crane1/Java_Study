package day0306;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadSrcText {
	public static void main(String[] args) {
		File file = new File("src/«‡¥∫–ﬁ¡∂ ÷≤·.txt");
		
		try {
			FileReader fr = new FileReader(file);
			char[] ch = new char[1024];
			while(fr.read(ch) != -1){
				System.out.println(new String(ch));
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
