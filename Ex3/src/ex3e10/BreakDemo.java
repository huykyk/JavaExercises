package ex3e10;

public class BreakDemo {
	/**��ʾ break ����ʹ��*/
	public static void main(String[] args) {
		int n = 1;
		int sum = 0;
		while (n <= 100) {
			sum = sum + n;
			if (sum > 100) {
				break;	//�����������˳�ѭ��
			}
			n = n + 2;
		}
		System.out.println("n = " + n);
		System.out.println("sum = " + sum);
	}
}
