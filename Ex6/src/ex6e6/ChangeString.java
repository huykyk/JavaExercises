package ex6e6;

public class ChangeString {
	public static void main(String[] args) {
		String s = new String("Hello,World");
		s.replace('o', 'A');	//s 的值并没有改变
		s = s.substring(0, 6).concat("Java");
		s.toUpperCase();		//s 的值并没有改变
		System.out.println(s);
	}
}
