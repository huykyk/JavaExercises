package ex3_15;
import java.util.Scanner;
public class Ex3_15 {
	/**�Ӽ�����������������������������������С�����������Լ�������*/
	public static int gcd(int a, int b) {
		while (a != 0 && b != 0) {
			if (a > b) {
				return gcd(a % b, b);
			} else {
				return gcd(b % a, a);		//�ݹ����GCD
			}
		}
		return a + b;
	}
	public static int lcm(int a, int b) {
		return a * b / gcd(a, b);			//LCM=A*B/GCD
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("��������������");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		System.out.println("��С��������" + lcm(a,b));
		System.out.println("���Լ����" + gcd(a,b));
		scanner.close();
	}
}




/*	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.println("��������������");
int a = scanner.nextInt();
int b = scanner.nextInt();
int gcd,lcm = a * b;
while (a != 0) {
	if (a > b) {
		a = a % b;
	} else {
		int temp = a;
		a = b;
		b = temp;
	}
}
gcd = b;
lcm = lcm / b;
System.out.println("��С��������" + lcm);
System.out.println("���Լ����" + gcd);
scanner.close();
}*/
