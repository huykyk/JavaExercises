package ex3e15;

public class PrimeNumber {
	/**���㲢���ǰ 50 ��������ÿ����� 10 ��*/
	public static void main(String[] args) {
		int count = 0;
		int number = 2;
		boolean isPrime;
		System.out.println("The first 50 primes are:");
		while (count < 50) {
			isPrime = true;
			for (int divisor = 2; divisor * divisor <= number; divisor++) {
				/**��ʱ�䡢�ռ临�Ӷȣ����� divisor <= number ��������һ����
				 * �� divisor = 2 �� 3 ʱ�������� divisor * divisor <= number ʽ��
				 * ��ִ��ѭ���壬ֱ�� isPrime = true */
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
