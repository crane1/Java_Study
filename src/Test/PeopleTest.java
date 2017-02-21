package Test;
import day0213.*;

//（2）创建主类：
//
//创建一个对象：名叫“张三”，性别“男”，年龄18岁，身高1.80；
//
//让该对象调用成员方法：
//
//说出“你好！”
//
//计算23+45的值
//
//将名字改为“李四”

public class PeopleTest {

	public static void main(String[] args) {
		People p = new People("张三", 18, "男",1.80);
		p.printPeopleInfo();
		p.say();
		System.out.println(p.add(23, 45));
		p.setName("李四");
		p.printPeopleInfo();
	}

}
