package day0210;

import java.util.Scanner;

public class BankCard {
	String id;
	double bankBalance;
	double aliBalance;
	
	BankCard(){}
	BankCard(String id){
		this.id = id;
	}
	
	void setId(String id){
		this.id = id;
	}
	
	String getId(){
		return id;
	}
	
	double viewBalance(String position){
		if (position.equals("���п�")){
			return bankBalance;
		}else{
			return aliBalance;
		}
	}
	
	// ȡǮ
	 void withdraw(double cashNum){
		withdraw(cashNum, "���п�");
	}
	
	// ȡǮ
	double minusBalance(double cashNum, double balance){
		balance -= cashNum;
		return balance;
	}
	
	// ȡǮ
	boolean withdraw(double cashNum, String position){
		System.out.println("ȡ���" + cashNum);
		if(position.equals("���п�")){
			if (bankBalance < cashNum){
				System.out.println("���п�����");
				return false;
			}
			bankBalance = minusBalance(cashNum, bankBalance);
		}else{
			if (aliBalance < cashNum){
				System.out.println("֧��������");
				return false;
			}
			aliBalance = minusBalance(cashNum, aliBalance);
		}
		System.out.println("��" + position + "����ȡ��" + cashNum + "Ԫ");
		return true;
	}
	
	// ���
	void deposit(double cashNum){
		bankBalance += cashNum;
		System.out.println("\n�����п��������" + cashNum + "Ԫ");
	}
	
	// ���
	double deposit(double cashNum, double balance){
		balance += cashNum;
		return balance;
	}
	
	// ���
	void deposit(double cashNum, String position){
		if(position.equals("���п�")){
			bankBalance = deposit(cashNum, bankBalance);
		}else{
			aliBalance = deposit(cashNum, aliBalance);
		}
		System.out.println("\n��" + position + "�������" + cashNum + "Ԫ");
	}
	
	// ��ӡ���
	void printBalance(){
		System.out.println("\n���п����Ϊ��" + this.viewBalance("���п�"));
		System.out.println("֧�������Ϊ��" + this.viewBalance("֧����"));
	}
	
	// ��ӡ����
	void printCardId(){
		System.out.println("��ǰ���п���Ϊ��" + this.getId());
	}
	
	// ���д�ȡǮϵͳ
	void runSystem(){
		Scanner input = new Scanner(System.in);
		System.out.println("���������п���");
		this.setId(input.next());
		this.printCardId();
		while(true){
			System.out.println("��ӭ�������п���ȡǮ��Ա��\n"
					+ "1.��Ǯ    2.ȡǮ    3.��ѯ���   4.��ѯ����"
					+ "5.�˳�");
			int inStr = input.nextInt();
			if (inStr == 1){
				System.out.print("����������");
				this.deposit(input.nextDouble());
				continue;
			} else if(inStr == 2){
				System.out.print("������ȡǮ��");
				this.withdraw(input.nextDouble());
				continue;
			} else if(inStr == 3){
				this.printBalance();
				continue;
			} else if(inStr == 4){
				this.printCardId();
				continue;
			} else if(inStr == 5){
				System.out.println("лл�ݹˣ�");
//				System.exit(0);
//				input.close();
				break;
			}
		}
	}
	
	public static void main(String[] args){
		BankCard bc = new BankCard();
		bc.runSystem();
	}
}
