package ex3_12;
import java.util.Scanner;
public class Ex3_12 {
	/**编写程序，从键盘上输入一个整数，计算并输出该数的各位数字之和*/
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("请输入一个整数：");
		int a = scanner.nextInt();
		int sum = 0,b;
		a = Math.abs(a);	//整数包括正负
		while (a >= 1) {
			b = a % 10;
			a = a / 10;
			sum += b;
		}
		System.out.println("各位数字之和为：" + sum);
		scanner.close();
	}
}
