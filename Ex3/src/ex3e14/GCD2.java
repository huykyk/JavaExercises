package ex3e14;
import java.util.Scanner;
public class GCD2 {
	/**用辗转相除法计算最大公约数*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first interger:");
		int m = sc.nextInt();
		System.out.println("Enter second interger:");
		int n = sc.nextInt();

		int a = m, b = n;	//保存初始数据
		int gcd = 1;
		int r;
		do {	//辗转相除法
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
