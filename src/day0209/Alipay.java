package day0209;

public class Alipay {
	String id;	// 用户名
	String pwd; // 密码
	int balance;  // 余额
	
	// 修改用户名
	void changeId(String newId){
		id = newId;
	}
	
	// 修改密码
	void changePwd(String newPwd){
		pwd = newPwd;
	}
	
	// 查看余额
	int viewBalance(){
		//输出语句
		System.out.println("余额："+balance);
		//返回语句
		return balance;
	}
	
	// 存钱
	int depositMoney(int newMoney){
		balance = balance + newMoney;
		return balance;
	}
	
	// 取钱
	int withdrawCash(int newMoney){
		balance = balance - newMoney;
		return balance;
	}
	
}
