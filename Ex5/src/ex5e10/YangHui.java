package ex5e10;

public class YangHui {
	/**��������Σ��ֳ���˹�������Σ��Ƕ���ʽϵ�����������е�һ�ּ������С�����ĳ����ӡ���ǰ 10 �����������*/
	public static void main(String[] args) {
		int i,j;
		int level = 10;
		int yanghui[][] = new int[level][];
		for (i = 0; i < yanghui.length; i++) {
			yanghui[i] = new int[i+1];
		}
		//Ϊ yanghui �����ÿ��Ԫ�ظ�ֵ
		yanghui[0][0] = 1;
		for (i = 1; i < yanghui.length; i++) {
			yanghui[i][0] = 1;
			for (j = 1; j < yanghui[i].length-1; j++) {
				yanghui[i][j] = yanghui[i-1][j-1] + yanghui[i-1][j];
			}
			yanghui[i][yanghui[i].length-1] = 1;
		}
		//��ӡ��� yanghui �����ÿ��Ԫ��
		for (i = 0; i < yanghui.length; i++) {
			for (j = 0; j < yanghui[i].length; j++) {
				System.out.print(yanghui[i][j] + " ");
			}
			System.out.println();
		}
	}
}
