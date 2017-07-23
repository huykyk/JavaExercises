package ex5e9;

public class MatrixTest {
	/**下面例子使用数组求一个矩阵的转置*/
	public static void printArray(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print("  " + arr[i][j]);
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int[][] a = {{15, 56, 20 ,-2}, {10, 80, -9, 31}, {76, -3, 99, 21}};
		System.out.println("The original matrix is:");
		printArray(a);
		int[][] b = new int[a[0].length][a.length];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				b[j][i] = a[i][j];
			}
		}
		System.out.println("The resault matrix is:");
		printArray(b);
	}
}
