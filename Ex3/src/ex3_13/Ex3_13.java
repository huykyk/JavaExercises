package ex3_13;

public class Ex3_13 {
	/**�����ѧ��ѧ����������Ϊ7.8%����̼���������ѧ�ѷ�һ��*/
	public static void main(String[] args) {
		final double RATE = 0.078;
		double fee = 1.0;
		int i = 0;
		while (fee < 2) {
			fee = fee + fee * RATE;
			i++;
		}
		System.out.println(i + "���ѧ�ѷ�һ��");
	}
}
