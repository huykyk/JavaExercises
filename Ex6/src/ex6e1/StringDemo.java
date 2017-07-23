package ex6e1;

public class StringDemo {
	public static void main(String[] args) {
		char chars1[] = {'A', 'B', 'C'};
		char chars2[] = {'ÖÐ', '¹ú', '¦°', '¦Á'};
		String s1 = new String(chars1);
		String s2 = new String(chars2, 0, 4);
		System.out.println("s1 = " + s1);
		System.out.println("s2 = " + s2);
		byte ascii1[] = {65, 66, 67};
		byte ascii2[] = {97, 98, 99, 100, 101};
		String s3 = new String(ascii1);
		String s4 = new String(ascii2, 0, 5);
		System.out.println("s3 = " + s3);
		System.out.println("s4 = " + s4);
	}
}
