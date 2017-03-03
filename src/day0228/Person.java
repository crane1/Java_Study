package day0228;

/**
 * 
 * 1.请声明一个person接口，指明鼻子，眼睛，嘴巴的数量，并声明走路，吃饭，睡觉的方法。
 *
 */
public interface Person {
	int noseNum = 1;
	int eyeNum = 2;
	int mouthNum = 1;
	
	void walk();
	void eat();
	void sleep();
	
	
}
