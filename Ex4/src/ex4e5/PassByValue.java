package ex4e5;

import ex4e1.Circle;

public class PassByValue {
	/**在 Java 语言中，方法的参数传递是按值传递，即在调用方法时将实际参数的值的一个拷贝传递给方法中的形式参数，方法调用结束后实际参数的值并不改变。形式参数是局部变量，其作用域只在方法内部，离开方法后自动释放。
	 * 尽管参数传递是按值传递的，但对于基本数据类型的参数和引用数据类型的参数的传递还是不同的。对于基本数据类型的参数，是将实际参数值的一个拷贝传递给方法，方法调用结束后，对原来的值没有影响。当参数是引用数据类型时，实际传递的是引用值，因此在方法的内部有可能改变原来的对象*/
	public void change(int y) {
		y = y * 2;
		System.out.println("y = " + y);
	}
	public void change(Circle cc) {
		cc.setRadius(100);
	}
	public static void main(String[] args) {
		PassByValue pv = new PassByValue();
		int x = 100;
		pv.change(x);
		System.out.println("x = " + x);
		Circle c = new Circle();
		c.setRadius(10);
		System.out.println("c 的半径 = " + c.getRadius());
		pv.change(c);
		System.out.println("c 的半径 = " + c.getRadius());
	}
}
