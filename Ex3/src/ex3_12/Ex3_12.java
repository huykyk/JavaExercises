package ex3_12;
import java.util.Scanner;
public class Ex3_12 {
	/**��д���򣬴Ӽ���������һ�����������㲢��������ĸ�λ����֮��*/
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("������һ��������");
		int a = scanner.nextInt();
		int sum = 0,b;
		a = Math.abs(a);	//������������
		while (a >= 1) {
			b = a % 10;
			a = a / 10;
			sum += b;
		}
		System.out.println("��λ����֮��Ϊ��" + sum);
		scanner.close();
	}
}
