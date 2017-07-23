package ex4e9;

public class Singleton {
	/**�� Java �������У���ʱϣ���κ�һ�������κ�ʱ��ֻ����һ��ʵ������ʱ���Խ��������Ϊ����ģʽ��singleton����Ҫ��һ�������Ϊ����ģʽ����Ҫ����Ĺ��췽���ķ������η�����Ϊ private��Ȼ�������ж���һ�� static �������ڸ÷����д�����Ķ���*/
	private static final Singleton INSTANCE = new Singleton();
	private int a = 0;
	private Singleton() {}	//���췽��
	public static synchronized Singleton getInstance() {
		return INSTANCE;
	}
	public void methodA() {
		a++;
		System.out.println("a = " + a);
	}
	public static void main(String[] args) {
		Singleton sg1 = Singleton.getInstance();
		Singleton sg2 = Singleton.getInstance();
		sg1.methodA();
		sg2.methodA();
		System.out.println(sg1 == sg2);
	}
}
