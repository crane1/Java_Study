package day0406;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;


public class ObjDemo {
	public static void writerObj(Object obj) throws FileNotFoundException, IOException{
		File f = new File("obj.txt");
		ObjectOutputStream oos = null;
		if (f.length() == 0){
			oos = new ObjectOutputStream(new FileOutputStream("obj.txt",true));
		} else {
			oos = new myObject(new FileOutputStream("obj.txt",true));
		}
		 
		oos.writeObject(obj);
		oos.close();
	}
	
	public static void readObj() throws FileNotFoundException, IOException, ClassNotFoundException{
		ObjectInputStream oos = new ObjectInputStream(new FileInputStream("obj.txt"));
		Object p = null;
		try{
			while((p = oos.readObject()) != null){
				System.out.println(p);
				p = null;
			}
		}catch(EOFException e){}
		oos.close();
	}
	
	
	
	public static void main(String[] args) {
		try {
			writerObj(new City("西安", 100.3, 330.5, "2017-03"));
			writerObj(new City("北京", 120.6, 300.5, "2017-06"));
			writerObj(new City("石家庄", 108.3, 256.5, "2017-01"));
			readObj();

			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}

class myObject extends ObjectOutputStream{

	
	public myObject(OutputStream out) throws IOException {
		super(out);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void writeStreamHeader() throws IOException {
		// TODO Auto-generated method stub
	}
}
