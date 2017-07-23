package ex4e11;

public class FiboDemo {
	/**下列例子使用递归方法打印输出 Fibonacci 数列的前 20 项。*/
	public static long fib(int n) {
		if (n == 1 || n == 2)
			return 1;
		else
			return fib(n-1) + fib(n-2);
	}
	public static void main(String[] args) {
		for (int i = 1; i <= 20; i++) {
			System.out.println("fib(" + i + ") = " + fib(i));
		}
	}
}
