package ex3;

abstract class Geometry { // ������״��
	abstract public double getArea();
}

class Lader extends Geometry { // ������
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

class Circle extends Geometry { // Բ����
	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	public double getArea() {
		return Math.PI * this.radius * this.radius;
	}
}

class Cone { // �й�׵�����
	private Geometry geometry;
	private double height;

	public Cone(Geometry geometry, double height) { // ��̬��
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
		System.out.println("Բ�������" + circle.getArea());
		System.out.println("����׶�����" + circleCone.getVolume());

		Lader lader = new Lader(3, 7, 3);
		Cone laderCone = new Cone(lader, 3);
		System.out.println("���������" + lader.getArea());
		System.out.println("����׶�����" + laderCone.getVolume());
	}
}
