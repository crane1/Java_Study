package day0406;

public class Leaves {
	private int row; // ��Ҷ����
	private int col; // ��
	
	// ������ʽ����ÿ���ַ�������������λ��
	private String[] leaves;
	
	// �к��еĹ�ϵ����Ȼ������������ʽ��1~1�� 2~3�� 3~5
	public Leaves(int row){
		this.row = row;
		this.col = row * 2 - 1;
		this.leaves = creatLeaf();
	}

	private String[] creatLeaf() {
		//����������������
		String[] str = new String[row];
		
		//�е��в�λ���൱���е�����
		int middle = row;
		for(int i = 1; i <= row; i++){
			String s = "";  
			// ÿ������һ���ַ���
			for(int j = 1; j <= col; j++){
				//���м�λ����������
				if(j >= (middle - i) + 1 && j <= (middle + i) - 1){
					s = s + "*";
				}else {
					s = s + " ";
				}
			}
			// �����ַ���
			str[i-1] = s;
		}
		return str;
	}
	
	public void printLeaves(){
		for(String s : leaves)
			System.out.println(s);
	}
	
	//���ݴ������Ŀո�������ÿ���ַ���
	public void setLeavesSit(int num){
		String add = "";
		for(int i = 0; i < num; i++){
			add += " "; 
		}
		
		for(int i = 0; i < leaves.length; i++){
			leaves[i] = add + leaves[i];
		}
	}
	
	//����ÿ�еĵ�һ����Ҷ��Ҫ����λ�ã�����ľ���ӵ���һ���ĺ��漴��
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
