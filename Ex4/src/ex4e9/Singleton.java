package ex4e9;

public class Singleton {
	/**在 Java 类的设计中，有时希望任何一个类在任何时候只能有一个实例。这时可以将该类设计为单例模式（singleton）。要将一个类设计为单例模式，需要把类的构造方法的访问修饰符声明为 private，然后在类中定义一个 static 方法，在该方法中创建类的对象*/
	private static final Singleton INSTANCE = new Singleton();
	private int a = 0;
	private Singleton() {}	//构造方法
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
