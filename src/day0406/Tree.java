package day0406;

public class Tree {
	private int row;  // ������������ 
	private int leavesRow;  //ÿ����Ҷ������
	private Leaves[] leavesArray;  //��Ҷ����
	private String trunk;  // ����
	
	public Tree(int row, int leavesRow){
		this.row = row;
		this.leavesRow = leavesRow;
		leavesArray = new Leaves[row];
		creatTree();
	}

	private void creatTree() {
		
		//Ϊÿ�д���һ����ʼ��Ҷ������������λ�ã������������������
		for(int i = 1; i <= row; i++ ){
			Leaves li = new Leaves(leavesRow);
			li.setLeavesSit((row - i) * leavesRow);
			for(int j = 2; j <= i; j++){
				Leaves l = new Leaves(leavesRow);
				li.addLeavesInLine(l);
			}
			//��������Ҷ������
			leavesArray[i-1] = li;
		}
		createTreeTrunk();
	}
	
	// ��������
	private void createTreeTrunk(){
		int middle = row * leavesRow;
		String s = "";
		for(int i = 1; i < middle - 1; i++){
			for(int j = 1; j < middle * 2 - 1; j++){
				if( j >= middle - leavesRow/2 && j <= middle + leavesRow/2){
					s += "*"; 
				}else{
					s += " ";
				}
			}
			s += "\n";
		}
		trunk = s;
	}
	
	public void printTree(){
		for(Leaves l : leavesArray){
			l.printLeaves();
		}
		System.out.println(trunk);
	}
	
	public static void main(String[] args) {
		Tree t = new Tree(3,5);
		t.printTree();
	}
}
