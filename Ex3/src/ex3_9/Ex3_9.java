package ex3_9;
import java.util.Scanner;
public class Ex3_9 {
	/**��д���򣬽����û��Ӽ���������10���������Ƚϲ�������е����ֵ����Сֵ*/
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������10��������ÿ����һ����enter������");
		int max = scanner.nextInt();
		int min = max;
		for (int i = 0; i < 9; i++) {
			int a = scanner.nextInt();
			if (a > max) {
				max = a;
			} else if (a < min) {
				min = a;
			}
		}
		System.out.println("����������������ǣ�" + max + "����С���ǣ�" + min);
		scanner.close();
	}
}
