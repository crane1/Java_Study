package day0209;
import java.util.Scanner;


public class Gift {
	String name;
	double price;
	
	void setName(String newName){
		name = newName;
	}
	
	String getName(){
		return name;
	}
	
	void setPrice(double newPrice){
		price = newPrice;
	}
	
	double getPrice(){
		return price;
	}
	
	static void printGiftInfo(Gift gift){
		System.out.println("\n��Ʒ���֣�" + gift.getName() + "\n��Ʒ�۸�" + gift.getPrice());
	}
	
	public static void main(String[] args){
		Gift gift = new Gift();
		Scanner input = new Scanner(System.in);
		System.out.println("��������Ʒ���ƣ�");
		gift.setName(input.next());
		System.out.println("��������Ʒ�۸�");
		gift.setPrice(input.nextDouble());
		
		printGiftInfo(gift);
		input.close();
		
	}
}
