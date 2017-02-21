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
		System.out.println("\n礼品名字：" + gift.getName() + "\n礼品价格：" + gift.getPrice());
	}
	
	public static void main(String[] args){
		Gift gift = new Gift();
		Scanner input = new Scanner(System.in);
		System.out.println("请输入礼品名称：");
		gift.setName(input.next());
		System.out.println("请输入礼品价格：");
		gift.setPrice(input.nextDouble());
		
		printGiftInfo(gift);
		input.close();
		
	}
}
