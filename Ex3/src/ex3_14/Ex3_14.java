package ex3_14;

public class Ex3_14 {
	/**��д����������е�ˮ�ɻ���*/
	public static void main(String[] args) {
		for (int i = 100; i < 1000; i++) {
			int a = i / 100;		//��λ
			int b = i / 10 % 10;	//ʮλ
			int c = i % 10;			//��λ
			if (Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3) == i) {
				System.out.println(i);
			}
		}
	}
}
