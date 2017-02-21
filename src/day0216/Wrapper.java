package day0216;

public class Wrapper {
	public static void main(String[] args) {
		int max = Integer.MAX_VALUE;
		System.out.println(max);
		int min = Integer.MIN_VALUE;
		System.out.println(min);
		int size = Integer.SIZE;  // Î»Êý
		System.out.println(size);
		
		String si = "1234";
		String sj = "5678";
		String sk = si + sj;
		System.out.println(sk);
		int i = Integer.valueOf(si);
		int j = Integer.valueOf(sj);
		int k = i + j;
		System.out.println("i=" + 2);
		int revI = Integer.reverse(2);
		System.out.println("rI=" + revI);
				
//		System.out.println(k);
	}
}
