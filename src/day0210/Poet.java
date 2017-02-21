package day0210;

public class Poet {
    String authorName = "李白";   // 诗人名字
    String dynasty = "唐朝";    // 朝代
    String poemName = "《蜀道难》";   // 诗名
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
    	System.out.println("---------诗人信息：----------\n诗人:" +
    		    this.getAuthorName() +
    		    "\n朝代：" + this.getDynasty() + 
    		    "\n诗名：" + this.getPoemName());
    	System.out.print("座驾：");
    	this.car.printCarInfo();
    }
    
    void driveCar(){
    	System.out.println(this.getAuthorName() + "正在驾驶 " + this.car.getName());
    	this.car.move();
    }
    
    public static void main(String[] args) {
		Poet poet = new Poet("李白");
		
		poet.setDynasty("唐朝");
		poet.setPoemName("《蜀道难》");
		
		
		
	}
    
}
