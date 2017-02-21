package day0217;

public class ManyArray {

	public static void main(String[] args) {
		int [][] a=new int[5][];
		
		a[0]=new int[]{23,45,56,23,24};
		a[1]=new int[]{40,45,34,22,32};
		a[2]=new int[]{23,45,56,23,24};
		a[3]=new int[]{40,45,34,22,32};
		a[4]=new int[]{23,45,56,23,24};
		
		// 1.全部矩阵输出
		for(int[] i : a){
			for(int j : i){
				System.out.print(j + "\t");
			}
			System.out.println();
		}
		
		System.out.println();
		
		// 2.输出矩阵下三角
		for(int i = 0; i < a.length; i++){
			
			for(int j = 0; j <= i; j++){
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println();
		
		// 3.输出矩阵对角线
		for(int i = 0; i < a.length; i++){
			
			for(int j = 0; j < i; j++){
				System.out.print("\t");
			}
			System.out.println(a[i][i]);
		}
		
		System.out.println();
		
		// 4.输出矩阵上三角
		for(int i = 0; i < a.length; i++){
			
			for(int j = 0; j < a[i].length; j++){
				if (j >= i){
					System.out.print(a[i][j] + "\t");
				} else {
					System.out.print("\t");
				}
				
			}
			System.out.println();
		}		

		
	}

}
