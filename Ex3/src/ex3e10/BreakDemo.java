package ex3e10;

public class BreakDemo {
	/**演示 break 语句的使用*/
	public static void main(String[] args) {
		int n = 1;
		int sum = 0;
		while (n <= 100) {
			sum = sum + n;
			if (sum > 100) {
				break;	//若条件成立退出循环
			}
			n = n + 2;
		}
		System.out.println("n = " + n);
		System.out.println("sum = " + sum);
	}
}
