package ex4e15;

public class InitDemo2 {
	/**��������м�Ϊʵ������ָ���˳�ֵ�����г�ʼ���飬���ڹ��췽���г�ʼ���˱�������ô���ǵ�ִ��˳����Σ���������ֵ�Ƕ��٣�*/
	int x = 100;
	{
		x = 60;
		System.out.println("x in initial block = " + x);
	}
	public InitDemo2() {
		x = 50;
		System.out.println("x in constructor = " + x);
	}
	public static void main(String[] args) {
		InitDemo2 d = new InitDemo2();
	}
}
