package ex3_13;

public class Ex3_13 {
	/**假设大学的学费年增长率为7.8%，编程计算多少年后学费翻一番*/
	public static void main(String[] args) {
		final double RATE = 0.078;
		double fee = 1.0;
		int i = 0;
		while (fee < 2) {
			fee = fee + fee * RATE;
			i++;
		}
		System.out.println(i + "年后学费翻一番");
	}
}
