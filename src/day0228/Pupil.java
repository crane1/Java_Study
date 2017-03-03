package day0228;

public class Pupil implements People{

	@Override
	public void eat() {
		System.out.println("小学生吃饭");
	}

	@Override
	public void sleep() {
		System.out.println("小学生睡觉");
	}

	@Override
	public void breath() {
		System.out.println("小学生呼吸");
	}

	@Override
	public void think() {
		System.out.println("小学生思考");
	}

	@Override
	public void study() {
		System.out.println("小学生学习");
	}

	
}
