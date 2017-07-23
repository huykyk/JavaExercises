package ex3e15;

public class PrimeNumber {
	/**计算并输出前 50 个素数，每行输出 10 个*/
	public static void main(String[] args) {
		int count = 0;
		int number = 2;
		boolean isPrime;
		System.out.println("The first 50 primes are:");
		while (count < 50) {
			isPrime = true;
			for (int divisor = 2; divisor * divisor <= number; divisor++) {
				/**简化时间、空间复杂度；若用 divisor <= number 运算量多一倍。
				 * 当 divisor = 2 和 3 时，不满足 divisor * divisor <= number 式，
				 * 不执行循环体，直接 isPrime = true */
				if(number % divisor == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				count++;
				if (count % 10 == 0) {
					System.out.println(number);
				}else {
					System.out.print(number + " ");
				}
			}
			number++;
		}
	}
}
