package day0223;

public class Automobile extends Vehicle{
	private String name;  // ��������
	private boolean canDelete;   // �Ƿ���Ա�ɾ��
	
	public Automobile(){}
	
	public Automobile(String name){
		this.setName(name);
		this.setDelete(true);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean canDelete() {
		return canDelete;
	}

	public void setDelete(boolean isDelete) {
		this.canDelete = isDelete;
	}
	
	public String toString(){
		return name;
	}
	
	public void show(){
		System.out.println("��������");
	}
	
}
