package day0301;

public class ChooseBall {
	public static void main(String[] args) {
		int[] redball = new int[33];
		int[] blackball = new int[16];
		
		for(int i = 0; i < redball.length; i++){
			redball[i] = (i + 1) * 2;
		}
		
		for(int i = 0; i < blackball.length; i++){
			blackball[i] = (i + 1) * 2;
		}
		
		System.out.println("ºìµÄ");
		for(int i = 0; i < 6; i++){
			int red = (int)(Math.random() * redball.length + 1);
			System.out.print(redball[red] + "\t");
		}
		
		System.out.println("\nºÚµÄ");
		
		int black = (int)(Math.random() * blackball.length + 1);
		System.out.print(blackball[black]);
	}
}
