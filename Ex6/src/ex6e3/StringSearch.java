package ex6e3;

public class StringSearch {
	public static void main(String[] args) {
		String s = new String("This is a Java string.");
		System.out.println(s.length());
		System.out.println(s.lastIndexOf('a'));
		System.out.println(s.lastIndexOf('a', 10));
		System.out.println(s.indexOf("is"));
		System.out.println(s.lastIndexOf("is"));
		System.out.println(s.indexOf("my"));
		String s1 = "It's insteresting.";
		s1 = s.concat(s1);
		System.out.println(s.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println(s.endsWith("ing"));
	}
}
