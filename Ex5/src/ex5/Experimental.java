package ex5;

public class Experimental {
	public static void printArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
				System.out.print("  " + a[i]);
		}
		System.out.println();
	}
	public static void modify(int a, int i) {
		a = a * i;
	}
	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4, 5};
		printArray(array);
		for (int i = 0; i < array.length; i++) {
			modify(array[i],i);
		}
		printArray(array);
	}
}
