package ex3_15;
import java.util.Scanner;
public class Ex3_15 {
	/**从键盘上输入两个整数，计算这两个数的最小公倍数和最大公约数并输出*/
	public static int gcd(int a, int b) {
		while (a != 0 && b != 0) {
			if (a > b) {
				return gcd(a % b, b);
			} else {
				return gcd(b % a, a);		//递归地求GCD
			}
		}
		return a + b;
	}
	public static int lcm(int a, int b) {
		return a * b / gcd(a, b);			//LCM=A*B/GCD
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入两个整数");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		System.out.println("最小公倍数：" + lcm(a,b));
		System.out.println("最大公约数：" + gcd(a,b));
		scanner.close();
	}
}




/*	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.println("请输入两个整数");
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
System.out.println("最小公倍数：" + lcm);
System.out.println("最大公约数：" + gcd);
scanner.close();
}*/
