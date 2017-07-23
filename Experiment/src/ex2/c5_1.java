package ex2;
import java.util.Scanner;
class Trangle {
	double side1, side2, side3, length, area;
	Trangle() {
		
	}
	Trangle(double s1,double s2,double s3) {
		if (s1+s2>s3 && s2+s3>s1 && s3+s1>s2) {
			side1 = s1;
			side2 = s2;
			side3 = s3;
		}else {
			System.out.println("����������߲��ܹ��������Σ�");
			System.exit(0);
		}
	}
	double getLength() {
		double l = this.side1 + this.side2 + this.side3;
		return l;
	}
	double getArea() {
		double a = this.side1;
		double b = this.side2;
		double c = this.side3;
		double p = (a + b + c)/2;
		double s = Math.sqrt(p*(p-a)*(p-b)*(p-c));
		return s;
	}
	void setTrangle(double s1,double s2,double s3) {
		if (s1+s2>s3 && s2+s3>s1 && s3+s1>s2) {
			side1 = s1;
			side2 = s2;
			side3 = s3;
		}else {
			System.out.println("����������߲��ܹ��������Σ�");
			System.exit(0);
		}
	}
}
class Lader {
	double above, bottom, height, area;
	Lader() {
		
	}
	Lader(double a,double b,double h) {
		above = a;
		bottom = b;
		height = h;
	}
	double getArea() {
		double a = (this.above + this.bottom)*this.height/2;
		return a;
	}
	void setLader(double a,double b,double h) {
		above = a;
		bottom = b;
		height = h;
	}
}
class Circle {
	double radius, length, area;
	Circle() {
		
	}
	Circle(double r) {
		radius = r;
	}
	double getRadius() {
		return this.radius;
	}
	double getLength() {
		double l = 2*Math.PI*this.radius;
		return l;
	}
	double getArea() {
		double s = Math.PI*this.radius*this.radius;
		return s;
	}
	void setRadius(double r) {
		radius = r;
	}
}
public class c5_1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("�����������εĵ�һ���߳���");
		double s1 = scanner.nextDouble();
		System.out.println("�����������εĵڶ����߳���");
		double s2 = scanner.nextDouble();
		System.out.println("�����������εĵ������߳���");
		double s3 = scanner.nextDouble();
		Trangle trangle = new Trangle();
		trangle.setTrangle(s1, s2, s3);
		double trangleLength = trangle.getLength();
		double trangleArea = trangle.getArea();
		System.out.println("�߳�Ϊ " + trangle.side1 + "��" + trangle.side2 + "��" + trangle.side3 + "��������");
		System.out.println("�ܳ�Ϊ��" + trangleLength);
		System.out.println("���Ϊ��" + trangleArea);
		
		System.out.println("���������ε��ϵף�");
		double a = scanner.nextDouble();
		System.out.println("���������ε��µף�");
		double b = scanner.nextDouble();
		System.out.println("���������εĸߣ�");
		double h = scanner.nextDouble();
		Lader lader = new Lader();
		lader.setLader(a, b, h);
		double laderArea = lader.getArea();
		System.out.println("�ϵ�Ϊ�� " + lader.above + "���µ�Ϊ��" + lader.bottom + "����Ϊ��" + lader.height + "������");
		System.out.println("���Ϊ��" + laderArea);
		
		System.out.println("������Բ�εİ뾶��");
		double r = scanner.nextDouble();
		Circle circle = new Circle();
		circle.setRadius(r);
		double circleArea = circle.getArea();
		System.out.println("�뾶Ϊ��" + circle.radius + "��Բ��");
		System.out.println("���Ϊ��" + circleArea);
		
		scanner.close();
	}
}
