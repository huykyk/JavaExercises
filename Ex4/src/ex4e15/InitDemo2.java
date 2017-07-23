package ex4e15;

public class InitDemo2 {
	/**如果在类中既为实例变量指定了初值，又有初始化块，还在构造方法中初始化了变量，那么它们的执行顺序如何，最后变量的值是多少？*/
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
