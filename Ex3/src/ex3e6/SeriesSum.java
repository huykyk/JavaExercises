package ex3e6;

public class SeriesSum {
	/**采用 while 循环结构，计算级数之和*/
	public static void main(String[] args) {
		int n = 1;
		double sum = 0;
		while(n <= 99){
			sum = sum + (double)n / (n+2);	//将一个操作数转换成 double
			n = n + 2;
		}
		System.out.println("sum = " + sum);
	}
}
