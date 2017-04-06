package day0406;

public class Leaves {
	private int row; // 树叶的行
	private int col; // 列
	
	// 数组形式保存每行字符串，方便设置位置
	private String[] leaves;
	
	// 行和列的关系是自然数对奇数的形式：1~1， 2~3， 3~5
	public Leaves(int row){
		this.row = row;
		this.col = row * 2 - 1;
		this.leaves = creatLeaf();
	}

	private String[] creatLeaf() {
		//根据行数创建数组
		String[] str = new String[row];
		
		//列的中部位置相当于行的数量
		int middle = row;
		for(int i = 1; i <= row; i++){
			String s = "";  
			// 每行生成一个字符串
			for(int j = 1; j <= col; j++){
				//在中间位置两侧的输出
				if(j >= (middle - i) + 1 && j <= (middle + i) - 1){
					s = s + "*";
				}else {
					s = s + " ";
				}
			}
			// 保存字符串
			str[i-1] = s;
		}
		return str;
	}
	
	public void printLeaves(){
		for(String s : leaves)
			System.out.println(s);
	}
	
	//根据传进来的空格数重设每行字符串
	public void setLeavesSit(int num){
		String add = "";
		for(int i = 0; i < num; i++){
			add += " "; 
		}
		
		for(int i = 0; i < leaves.length; i++){
			leaves[i] = add + leaves[i];
		}
	}
	
	//除了每行的第一个树叶需要重设位置，其余的均添加到第一个的后面即可
	public void addLeavesInLine(Leaves l){
		for(int i = 0; i < row; i++){
			leaves[i] += " " + l.leaves[i]; 
		}
	}
	
	public static void main(String[] args) {
		Leaves l = new Leaves(3);
		l.printLeaves();
		
	}
}
