package ex3e6;

public class SeriesSum {
	/**���� while ѭ���ṹ�����㼶��֮��*/
	public static void main(String[] args) {
		int n = 1;
		double sum = 0;
		while(n <= 99){
			sum = sum + (double)n / (n+2);	//��һ��������ת���� double
			n = n + 2;
		}
		System.out.println("sum = " + sum);
	}
}
