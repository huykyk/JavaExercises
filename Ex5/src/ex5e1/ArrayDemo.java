package ex5e1;

public class ArrayDemo {
	/** 下列程序演示了数组的使用和 length 成员的使用 */
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
