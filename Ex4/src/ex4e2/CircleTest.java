package ex4e2;

import ex4e1.Circle;

public class CircleTest {
	/**有了类就可以创建对象并指定对象的初始状态，然后通过调用对象的方法实现对象的操作。下列程序使用 Circle 类求给定半径的圆的周长和面积*/
	public static void main(String[] args) {
		Circle cc;
		cc = new Circle();		//创建一个Circle类对象
		cc.setRadius(10);
		System.out.println("半径 = " + cc.radius);
		System.out.println("周长 = " + cc.perimeter());
		System.out.println("面积 = " + cc.area());
	}
}
