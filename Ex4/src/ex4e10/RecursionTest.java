package ex4e10;

public class RecursionTest {
	/**�ݹ飨recursion���ǽ�����������һ�ֳ��������������˼����ǰ������𽥼򵥻������ʵ���������⡣
	 * Java ����֧�ַ����ĵݹ���á���ν�����ĵݹ���þ��Ƿ����Լ������Լ���
	 * ���磬�������� n �Ľ׳� n!���Ϳ���ͨ���ݹ�ʵ��*/
	public static long factor(int n) {
		if(n == 0)
			return 1;
		else
			return n * factor(n-1);
	}
	public static void main(String[] args) {
		int k = 20;
		System.out.println(k + "!=" + factor(k));
		System.out.println("max = " + Long.MAX_VALUE);	//long ���������ֵ
	}
}
