package day0303;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class PropertiseDemo {
	
	
	public static void main(String[] args) {
		String fileName = "D:\\key-set.txt";
		
		PropertiseDemo pd = new PropertiseDemo();
		
		// 用来保存键值对文件的一个对象
		Properties p = new Properties();
		Properties p1 = new Properties();
		
		pd.setProperties(p);  // 给p里面添加数据
		
		pd.saveFile(fileName, p);  // 把p里面的东西保存到文件里
		
		
		
		pd.readFile(fileName, p1);  // 读到p1 里面
		pd.getInfo(p1);
	}
	
	public void setProperties(Properties p){
		// 给 p 里面设置三条数据
		p.setProperty("1", "李泽明");
		p.setProperty("2", "李倩");
		p.setProperty("3", "李娟");
	}
	
	public void saveFile(String fileName, Properties p){
		File f1 = new File(fileName);
		
		try {
			p.store(new FileOutputStream(f1), "学号列表");
			System.out.println("保存完毕");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void readFile(String fileName, Properties p){
		File f2 = new File(fileName);
		
		try {
			p.load(new FileInputStream(f2));
			System.out.println("读入完毕");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void getInfo(Properties p){
		// 获取键值对文件 的key值集合set
		Set<Object> s = p.keySet();
		
		Iterator<Object> it = s.iterator();
		
		while(it.hasNext()){
			String obj = (String)it.next();
			System.out.println("key:" + obj + " value:" + p.getProperty(obj));
		}
	}
}
