package ex4e13;

public class RandomCharacter {
	/**һ��أ�(int)(Math.random() * (a+1)) + b ���� b~a+b ������������� a+b
	 * ��������������100��Сд��ĸ*/
	public static char getLetter() {
		return (char)('a' + Math.random() * ('z' - 'a' + 1));
	}
	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			System.out.print(getLetter() + " ");
			if (i % 20 == 0)
				System.out.println();	//ÿ��� 20 ����ĸ����
		}
	}
}
