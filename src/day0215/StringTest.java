package day0215;

public class StringTest {
	public static void main(String[] args) {
		String s = "I have a dream";
		String s1 = new String("I have a dream");
		System.out.println(s.charAt(3));
		System.out.println(s.concat(", I will fly"));
		System.out.println(s.equals(s1));
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s.compareTo(s1));
		System.out.println(s.compareToIgnoreCase(s1));
		System.out.println(s.substring(3));
		System.out.println(s.endsWith("m"));
		System.out.println(s.isEmpty());
		System.out.println(String.valueOf(2324.2342).getClass());
		System.out.println(s.replace("have", "had"));
		
		StringBuffer s2 = new StringBuffer(s);
		System.out.println(s2.reverse());;
		System.out.println(Integer.valueOf("34324234"));
		
	}
}
