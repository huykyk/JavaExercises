package ex4e10;

public class RecursionTest {
	/**递归（recursion）是解决复杂问题的一种常见方法。其基本思想就是把问题逐渐简单化，最后实现问题的求解。
	 * Java 语言支持方法的递归调用。所谓方法的递归调用就是方法自己调用自己。
	 * 例如，求正整数 n 的阶乘 n!，就可以通过递归实现*/
	public static long factor(int n) {
		if(n == 0)
			return 1;
		else
			return n * factor(n-1);
	}
	public static void main(String[] args) {
		int k = 20;
		System.out.println(k + "!=" + factor(k));
		System.out.println("max = " + Long.MAX_VALUE);	//long 型数的最大值
	}
}
