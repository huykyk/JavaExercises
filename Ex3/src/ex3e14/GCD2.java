package ex3e14;
import java.util.Scanner;
public class GCD2 {
	/**��շת������������Լ��*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first interger:");
		int m = sc.nextInt();
		System.out.println("Enter second interger:");
		int n = sc.nextInt();

		int a = m, b = n;	//�����ʼ����
		int gcd = 1;
		int r;
		do {	//շת�����
			r = m % n;
			if (r == 0) {
				gcd = n;
			}else {
				m = n;
				n = r;
			}
		} while (r != 0);
		System.out.println("The GCD of " + a + " and " + b + " is " + gcd);
		sc.close();
	}
}
