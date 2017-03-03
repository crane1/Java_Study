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
		
		// ���������ֵ���ļ���һ������
		Properties p = new Properties();
		Properties p1 = new Properties();
		
		pd.setProperties(p);  // ��p�����������
		
		pd.saveFile(fileName, p);  // ��p����Ķ������浽�ļ���
		
		
		
		pd.readFile(fileName, p1);  // ����p1 ����
		pd.getInfo(p1);
	}
	
	public void setProperties(Properties p){
		// �� p ����������������
		p.setProperty("1", "������");
		p.setProperty("2", "��ٻ");
		p.setProperty("3", "���");
	}
	
	public void saveFile(String fileName, Properties p){
		File f1 = new File(fileName);
		
		try {
			p.store(new FileOutputStream(f1), "ѧ���б�");
			System.out.println("�������");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void readFile(String fileName, Properties p){
		File f2 = new File(fileName);
		
		try {
			p.load(new FileInputStream(f2));
			System.out.println("�������");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void getInfo(Properties p){
		// ��ȡ��ֵ���ļ� ��keyֵ����set
		Set<Object> s = p.keySet();
		
		Iterator<Object> it = s.iterator();
		
		while(it.hasNext()){
			String obj = (String)it.next();
			System.out.println("key:" + obj + " value:" + p.getProperty(obj));
		}
	}
}
