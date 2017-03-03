package day0301;

public class Test {

	public static void main(String[] args) {
		MMStar ms = new MMStar();
		
		MMPerson mp = new MMPerson("Lisa");
		mp.setType("GG");
		
		try {
			ms.visit(mp);
		} catch (PersonalException e) {
			e.printStackTrace();
		}
	}

}
