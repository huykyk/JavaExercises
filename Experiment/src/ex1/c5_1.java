package ex1;
//��ӡӢ����ĸ���Լ����ǵ� unicode �ַ���
public class c5_1 {
	public static void main(String[] args) {
		char i;
		for (i = 'a'; i <= 'z'; i++) {
			System.out.println(i + " "  + (int)i + " " + (char)(i-32) + " " + (i-32));
		}
	}
}
