package day0221;

import java.io.File;

public class FileTest {

	public static void main(String[] args) {
		File f = new File("D:\\workspace\\TechnologyShow");
		
		System.out.println("绝对路径：" + f.getAbsolutePath());
		System.out.println("文件名：" + f.getName());
		System.out.println("文件路径：" + f.getPath());
		
		String[] name = f.list();
		for(String s : name){
			System.out.println(s);
		}
		
	}

}
