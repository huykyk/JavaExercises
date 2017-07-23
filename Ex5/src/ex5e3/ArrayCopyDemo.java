package ex5e3;

public class ArrayCopyDemo {
	/** ʹ�� arraycopy �������Խ�Դ�����һ���ָ�ֵ��Ŀ�������С�ע�⣬���Ŀ�����鲻��������Դ����Ԫ�أ����׳��쳣 */
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int[] a1 = { 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		int[] a2 = { 8, 7, 6, 5, 4 };
		try {
			System.arraycopy(a, 0, a1, 0, a.length);
			System.arraycopy(a, 0, a2, 0, a.length);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		for (int elem : a1) {
			System.out.print(elem + "  ");
		}
		System.out.println();
		for (int elem : a2) {
			System.out.print(elem + "  ");
		}
		System.out.println("\n");
	}
}
