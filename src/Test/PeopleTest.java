package Test;
import day0213.*;

//��2���������ࣺ
//
//����һ���������С����������Ա��С�������18�꣬���1.80��
//
//�øö�����ó�Ա������
//
//˵������ã���
//
//����23+45��ֵ
//
//�����ָ�Ϊ�����ġ�

public class PeopleTest {

	public static void main(String[] args) {
		People p = new People("����", 18, "��",1.80);
		p.printPeopleInfo();
		p.say();
		System.out.println(p.add(23, 45));
		p.setName("����");
		p.printPeopleInfo();
	}

}
