package ex3_10;

public class Ex3_10 {
	/**��⡸����ͬ�����⡹����������һ�����������100����ͷ40�����ʼ��ø��м�ֻ*/
	public static void main(String[] args) {
		for (int x = 0; x < 40; x++) {
			for (int y = 0; y < 40; y++) {
				if (2 * x + 4 * y == 100 & x + y == 40) {
					System.out.println("�м�" + x + "ֻ��Ѽ" + y + "ֻ");
				}
			}
		}
	}
}
