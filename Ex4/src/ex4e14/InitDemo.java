package ex4e14;

public class InitDemo {
	/**在类的定义中如果没有为变量赋初值，则编译器采用默认值为变量初始化。对引用类型的变量，默认值为 null*/
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
