package ex3e9;

public class NineTable {
	/**打印输出九九乘法表*/
	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i + "×" + j + "=" + i*j + "  ");
			}
			System.out.println();
		}
	}
}
