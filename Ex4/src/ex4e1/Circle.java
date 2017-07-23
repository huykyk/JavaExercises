package ex4e1;

public class Circle {
	/**可以说 Java 程序一切都是对象。要想得到对象，首先必须定义类（也可以使用事先定义好的类），然后创建对象*/
	public double radius;					//成员变量
	
	public void setRadius(double r) {		//成员方法
		radius = r;
	}
	public double getRadius() {
		return radius;
	}
	public double perimeter() {
		return 2 * Math.PI * radius;
	}
	public double area() {
		return Math.PI * radius *radius;
	}
}
