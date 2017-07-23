package ex3_18;

public class Ex3_18 {
	/**编写程序，计算当n=10000,20000,…,100000时π的值
	 * π = 4 × (1 - 1/3 + 1/5 - 1/7 + … + 1/(2n-1) - 1/(2n+1))*/
	public static double computPi(int i) {
		double pi = 0.0;
		int sign = 1;
		for (int n = 1; n <= i; n++) {
			sign = (n % 2 == 0) ? -1 : 1; 
			pi = pi + sign*(1.0/(2*n-1));
		}
		pi = pi * 4;
		return pi;
	}
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			double pi = computPi(i * 10000);
			System.out.println(pi);
		}
	}
}
