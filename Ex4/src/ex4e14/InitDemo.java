package ex4e14;

public class InitDemo {
	/**����Ķ��������û��Ϊ��������ֵ�������������Ĭ��ֵΪ������ʼ�������������͵ı�����Ĭ��ֵΪ null*/
	int i;
	boolean b;
	double d;
	String s;
	public void display() {
		System.out.println("i = " + i);
		System.out.println("b = " + b);
		System.out.println("d = " + d);
		System.out.println("s = " + s);
	}
	public static void main(String[] args) {
		InitDemo o = new InitDemo();
		o.display();
	}
}
