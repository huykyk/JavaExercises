package ex3e8;
import java.util.Scanner;
public class DoWhileDemo {
	/**�û��Ӽ������������ɸ� double ����������0���������������㲢�����Щ�����ܺ���ƽ��ֵ*/
	public static void main(String[] args) {
		double sum = 0, avg = 0;
		int n = 0;
		double number;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Enter a number:");
			number = sc.nextDouble();
			if (number != 0) {
				sum = sum + number;
				n = n + 1;
			}
		} while (number != 0);
		avg = sum / n;
		System.out.println("sum = " + sum);
		System.out.println("avg = " + avg);
		sc.close();
	}
}
