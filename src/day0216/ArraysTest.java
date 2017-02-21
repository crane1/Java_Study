package day0216;

import java.util.Arrays;

public class ArraysTest {

	public static void main(String[] args) {
		int[] a = {34, 324, 32, 44, 23, 523};
		Arrays.sort(a);
		int b = Arrays.binarySearch(a, 324);
		System.out.println(b);
		Arrays.fill(a, 34);
		Arrays.fill(a, 0, 4, 32);
		int c[] = Arrays.copyOf(a, 4);
		for (int i : c) {
			System.out.println(i);
		}
		
		System.out.println(Arrays.toString(a));
	}

}
