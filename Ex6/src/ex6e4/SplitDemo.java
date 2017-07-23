package ex6e4;

public class SplitDemo {
	public static void main(String[] args) {
		String ss = "one little,two little,three little.";
		String[] str = ss.split("[ ,.]");
		for (String s : str) {
			System.out.println(s);
		}
		System.out.println(ss.matches(".* little.*"));	//Êä³ö true
	}
}
