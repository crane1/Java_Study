package day0306;

import java.util.Arrays;
import java.util.Comparator;

public class LengthComparator implements Comparator<String>{
	public static void main(String[] args) {
		String[] friends = {"Peter", "Paul", "Mary"};
		Arrays.sort(friends, new LengthComparator());
		
		for (String string : friends) {
			System.out.println(string);
		}
	}

	@Override
	public int compare(String o1, String o2) {
		return o1.length() - o2.length();
	}
}
