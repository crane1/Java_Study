package day0209;

public class Alipay {
	String id;	// �û���
	String pwd; // ����
	int balance;  // ���
	
	// �޸��û���
	void changeId(String newId){
		id = newId;
	}
	
	// �޸�����
	void changePwd(String newPwd){
		pwd = newPwd;
	}
	
	// �鿴���
	int viewBalance(){
		//������
		System.out.println("��"+balance);
		//�������
		return balance;
	}
	
	// ��Ǯ
	int depositMoney(int newMoney){
		balance = balance + newMoney;
		return balance;
	}
	
	// ȡǮ
	int withdrawCash(int newMoney){
		balance = balance - newMoney;
		return balance;
	}
	
}
