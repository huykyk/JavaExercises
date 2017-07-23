package ex3e8;
import java.util.Scanner;
public class DoWhileDemo {
	/**用户从键盘上输入若干个 double 型数（输入0则结束），程序计算并输出这些数的总和与平均值*/
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
