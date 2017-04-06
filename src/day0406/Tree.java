package day0406;

public class Tree {
	private int row;  // 数的整体行数 
	private int leavesRow;  //每个树叶的行数
	private Leaves[] leavesArray;  //树叶数组
	private String trunk;  // 树干
	
	public Tree(int row, int leavesRow){
		this.row = row;
		this.leavesRow = leavesRow;
		leavesArray = new Leaves[row];
		creatTree();
	}

	private void creatTree() {
		
		//为每行创建一个初始树叶，并重设他的位置，后面的添加在这个后面
		for(int i = 1; i <= row; i++ ){
			Leaves li = new Leaves(leavesRow);
			li.setLeavesSit((row - i) * leavesRow);
			for(int j = 2; j <= i; j++){
				Leaves l = new Leaves(leavesRow);
				li.addLeavesInLine(l);
			}
			//保存在树叶数组中
			leavesArray[i-1] = li;
		}
		createTreeTrunk();
	}
	
	// 创建树干
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
