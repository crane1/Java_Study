package day0224;

public class StationeryStore {
	
	public void sale(Pen pen){
		if (pen.isSaled()){
			System.out.println("��֧���Ѿ����ȥ��");
			return;
		}
		System.out.println("��֧" + pen.getName() + "�ۼۣ�" + pen.getPrice());
		pen.setSaled(true);
	}
	
	public void sale(Eraser eraser){
		if (eraser.isSaled()){
			System.out.println("�����Ƥ�Ѿ����ȥ��");
			return;
		}
		System.out.println("���" + eraser.getName() + "�ۼۣ�" + eraser.getPrice());
		eraser.setSaled(true);
	}
}
