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
			System.out.println("输入的三条边不能构成三角形！");
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
			System.out.println("输入的三条边不能构成三角形！");
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
		
		System.out.println("请输入三角形的第一条边长：");
		double s1 = scanner.nextDouble();
		System.out.println("请输入三角形的第二条边长：");
		double s2 = scanner.nextDouble();
		System.out.println("请输入三角形的第三条边长：");
		double s3 = scanner.nextDouble();
		Trangle trangle = new Trangle();
		trangle.setTrangle(s1, s2, s3);
		double trangleLength = trangle.getLength();
		double trangleArea = trangle.getArea();
		System.out.println("边长为 " + trangle.side1 + "、" + trangle.side2 + "、" + trangle.side3 + "的三角形");
		System.out.println("周长为：" + trangleLength);
		System.out.println("面积为：" + trangleArea);
		
		System.out.println("请输入梯形的上底：");
		double a = scanner.nextDouble();
		System.out.println("请输入梯形的下底：");
		double b = scanner.nextDouble();
		System.out.println("请输入梯形的高：");
		double h = scanner.nextDouble();
		Lader lader = new Lader();
		lader.setLader(a, b, h);
		double laderArea = lader.getArea();
		System.out.println("上底为： " + lader.above + "，下底为：" + lader.bottom + "，高为：" + lader.height + "的梯形");
		System.out.println("面积为：" + laderArea);
		
		System.out.println("请输入圆形的半径：");
		double r = scanner.nextDouble();
		Circle circle = new Circle();
		circle.setRadius(r);
		double circleArea = circle.getArea();
		System.out.println("半径为：" + circle.radius + "的圆形");
		System.out.println("面积为：" + circleArea);
		
		scanner.close();
	}
}
