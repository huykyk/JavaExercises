package ex6e6;

public class ChangeString {
	public static void main(String[] args) {
		String s = new String("Hello,World");
		s.replace('o', 'A');	//s ��ֵ��û�иı�
		s = s.substring(0, 6).concat("Java");
		s.toUpperCase();		//s ��ֵ��û�иı�
		System.out.println(s);
	}
}
