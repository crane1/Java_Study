package day0221;

import java.io.File;

public class FileTest {

	public static void main(String[] args) {
		File f = new File("D:\\workspace\\TechnologyShow");
		
		System.out.println("����·����" + f.getAbsolutePath());
		System.out.println("�ļ�����" + f.getName());
		System.out.println("�ļ�·����" + f.getPath());
		
		String[] name = f.list();
		for(String s : name){
			System.out.println(s);
		}
		
	}

}
