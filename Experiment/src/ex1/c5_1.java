package ex1;
//打印英文字母表以及他们的 unicode 字符集
public class c5_1 {
	public static void main(String[] args) {
		char i;
		for (i = 'a'; i <= 'z'; i++) {
			System.out.println(i + " "  + (int)i + " " + (char)(i-32) + " " + (i-32));
		}
	}
}
