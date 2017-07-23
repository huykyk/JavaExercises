package ex5e11;

public class MatrixMultiple {
	/**矩阵乘法，详见课本P107*/
	public static void main(String[] args) {
		int a[][] = {{5, 7, 8, 2},
					{-2, 4, 1, 2},
					{1, 2, 3, 4}};
		int b[][] = {{4, -2, 3, 3, 9},
					{4, 3, 8, -1, 2},
					{2, 3, 5, 2, 7},
					{1, 0, 6, 3, 4}};
		int c[][] = new int[a.length][b[0].length];
		//计算矩阵乘法
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b[0].length; j++) {
				for (int k = 0; k < a[0].length; k++) {
					c[i][j] = c[i][j] + a[i][k] * b[k][j];
				}
			}
		}
		//输出结果矩阵
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[0].length; j++) {
				System.out.print(c[i][j] + "  ");
			}
			System.out.println();
		}
	}
}
