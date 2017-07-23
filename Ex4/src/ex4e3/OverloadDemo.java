package ex4e3;

public class OverloadDemo {
	/**在类中定义了重载方法后，对重载方法的调用与一般方法的调用相同，下列程序在 OverloadDemo 类中定义了四个重载的 show 方法*/
	public void show() {
		System.out.println("No Parameters.");
	}
	public void show(int a, int b) {
		System.out.println("a = " + a + ",b = " + b);
	}
	public void show(double d) {
		System.out.println("d = " + d);
	}
	public void show(int a) {
		System.out.println("a = " + a);
	}
	public static void main(String[] args) {
		OverloadDemo od = new OverloadDemo();
		od.show();
		od.show(10);
		od.show(50, 60);
		od.show(100.0);
	}
}
