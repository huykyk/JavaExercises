package ex5e1;

public class ArrayDemo {
	/** ���г�����ʾ�������ʹ�ú� length ��Ա��ʹ�� */
	public static void main(String[] args) {
		int[] anArray = new int[10];
		for (int i = 0; i < anArray.length; i++) {
			anArray[i] = i * 10;
		}
		for (int j = anArray.length - 1; j >= 0; j--) {
			System.out.print("  " + anArray[j]);
		}
		System.out.println();
		System.out.println(anArray.length);
		// System.out.println(anArray[10]);
	}
}
