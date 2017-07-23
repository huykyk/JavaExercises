package ex3_17;
import java.util.Scanner;
public class Ex3_17 {
	/**编写程序读入一个整数，显示该整数的所有素数因子*/
	private static boolean isPrime(int i) {
		boolean a = true;
		for (int j = 2; j < i; j++) {
			if (i % j == 0) {
				a = false;
			}
		}
		return a;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个整数：");
		int x = scanner.nextInt();
		for (int i = 2; i <= x; i++) {
			if (x % i ==0 & isPrime(i)) {
				System.out.printf("%-4d", i);
			}
		}
		scanner.close();
	}
}




/*public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("请输入一个整数：");
	int n = scanner.nextInt();
	do {
		for (int k = 2; k <= n; k++) {
			if (n % k == 0) {
				System.out.println(k);
				n = n / k;
				break;
			}
		}
	} while (n != 1);
}*/
