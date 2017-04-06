package day0406;

public class Triangle {
	private  int row;
	private String[] triangle;
	
	
	public Triangle(int row){
		this.row = row;
		triangle = new String[row];
		creatTriangle();
	}


	private void creatTriangle() {
		
		for(int i = 1; i <= row; i++){
			String s = "";
			for(int j = 1; j <= row; j++){
				if ( j > row - i){
					s += "*"; 
				}else{
					s += " ";
				}
			}
			triangle[i-1] = s;
		}
		
	}
	
	public void printTriangle(){
		for(String s : triangle){
			System.out.println(s);
		}
		for(int i = triangle.length-2; i >= 0; i--){
			System.out.println(triangle[i]);
		}
		
	}
	
	public static void main(String[] args) {
		Triangle t = new Triangle(100);
		t.printTriangle();
	}
}
