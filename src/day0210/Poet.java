package day0210;

public class Poet {
    String authorName = "���";   // ʫ������
    String dynasty = "�Ƴ�";    // ����
    String poemName = "������ѡ�";   // ʫ��
    Car car;
    BankCard card;
    
    Poet(){}
    
	Poet(String authorName) {
		this.authorName = authorName;
		card = new BankCard();
	}
    
    String getAuthorName(){
    	return authorName;
    }
    
    void setAuthorName(String name){
    	authorName = name;
    }
    
    String getDynasty(){
    	return dynasty;
    }
    
    void setDynasty(String dynasty){
    	this.dynasty = dynasty;
    }
    
    String getPoemName(){
    	return poemName;
    }
    
    void setPoemName(String name){
    	poemName = name;
    }
    
    void printPoetInfo(){
    	System.out.println("---------ʫ����Ϣ��----------\nʫ��:" +
    		    this.getAuthorName() +
    		    "\n������" + this.getDynasty() + 
    		    "\nʫ����" + this.getPoemName());
    	System.out.print("���ݣ�");
    	this.car.printCarInfo();
    }
    
    void driveCar(){
    	System.out.println(this.getAuthorName() + "���ڼ�ʻ " + this.car.getName());
    	this.car.move();
    }
    
    public static void main(String[] args) {
		Poet poet = new Poet("���");
		
		poet.setDynasty("�Ƴ�");
		poet.setPoemName("������ѡ�");
		
		
		
	}
    
}
