package ex5e10;

public class YangHui {
	/**杨辉三角形，又称帕斯卡三角形，是二项式系数在三角形中的一种几何排列。下面的程序打印输出前 10 行杨辉三角形*/
	public static void main(String[] args) {
		int i,j;
		int level = 10;
		int yanghui[][] = new int[level][];
		for (i = 0; i < yanghui.length; i++) {
			yanghui[i] = new int[i+1];
		}
		//为 yanghui 数组的每个元素赋值
		yanghui[0][0] = 1;
		for (i = 1; i < yanghui.length; i++) {
			yanghui[i][0] = 1;
			for (j = 1; j < yanghui[i].length-1; j++) {
				yanghui[i][j] = yanghui[i-1][j-1] + yanghui[i-1][j];
			}
			yanghui[i][yanghui[i].length-1] = 1;
		}
		//打印输出 yanghui 数组的每个元素
		for (i = 0; i < yanghui.length; i++) {
			for (j = 0; j < yanghui[i].length; j++) {
				System.out.print(yanghui[i][j] + " ");
			}
			System.out.println();
		}
	}
}
