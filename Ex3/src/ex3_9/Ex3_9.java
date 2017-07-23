package ex3_9;
import java.util.Scanner;
public class Ex3_9 {
	/**编写程序，接受用户从键盘上输入10个整数，比较并输出其中的最大值和最小值*/
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入10个整数，每输入一个按enter结束：");
		int max = scanner.nextInt();
		int min = max;
		for (int i = 0; i < 9; i++) {
			int a = scanner.nextInt();
			if (a > max) {
				max = a;
			} else if (a < min) {
				min = a;
			}
		}
		System.out.println("您输入的数中最大的是：" + max + "，最小的是：" + min);
		scanner.close();
	}
}
