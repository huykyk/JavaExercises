package ex3_16;

public class Ex3_16 {
	/**编写程序，求出1~1000的所有完全数*/
	public static void main(String[] args) {
		for (int i = 2; i <= 1000; i++) {
			int sum = 0;
			for (int j = 1; j < i; j++) {
				if (i % j == 0) {
					sum = sum + j;
				}
			}
			if (sum == i) {
				System.out.println(i);
			}
		}
	}
}
