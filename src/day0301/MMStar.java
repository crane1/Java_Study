package day0301;

public class MMStar {
	private MMPerson[] mmPersons = new MMPerson[10];
	
	public void visit(MMPerson m) throws PersonalException {
		if (!m.getType().equals("MM")){
			throw new PersonalException("��MM��ǰ���ݷ�");
		}		
	}
	
}
