package ex3e14;
import java.util.Scanner;
public class GCD {
	/**求两个整数的最大公约数*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first interger:");
		int m = sc.nextInt();
		System.out.println("Enter second interger:");
		int n = sc.nextInt();
		
		int gcd = 1;
		int k = 2;
		while (k <= m && k <= n) {
			if (m % k == 0 && n % k == 0) {	//判断 k 是否能同时被 m 和 n 整除
				gcd = k;
			}
			k++;
		}
		System.out.println("The GCD of " + m + " and " + n + " is " + gcd);
		sc.close();
	}
}
