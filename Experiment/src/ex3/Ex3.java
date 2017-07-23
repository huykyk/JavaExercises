package ex3;

abstract class Geometry { // 几何形状类
	abstract public double getArea();
}

class Lader extends Geometry { // 梯形类
	private double above, bottom, height;

	public Lader(double above, double bottom, double height) {
		this.above = above;
		this.bottom = bottom;
		this.height = height;
	}

	public double getArea() {
		return (this.above + this.bottom) * this.height / 2;
	}
}

class Circle extends Geometry { // 圆形类
	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	public double getArea() {
		return Math.PI * this.radius * this.radius;
	}
}

class Cone { // 有关椎体的类
	private Geometry geometry;
	private double height;

	public Cone(Geometry geometry, double height) { // 动态绑定
		this.geometry = geometry;
		this.height = height;
	}

	public double getVolume() {
		return geometry.getArea() * height / 3.0;
	}
}

public class Ex3 {
	public static void main(String[] args) {
		Circle circle = new Circle(10);
		Cone circleCone = new Cone(circle, 3);
		System.out.println("圆形面积：" + circle.getArea());
		System.out.println("梯形锥体积：" + circleCone.getVolume());

		Lader lader = new Lader(3, 7, 3);
		Cone laderCone = new Cone(lader, 3);
		System.out.println("梯形面积：" + lader.getArea());
		System.out.println("梯形锥体积：" + laderCone.getVolume());
	}
}
