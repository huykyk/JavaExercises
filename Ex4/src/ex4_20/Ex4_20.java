package ex4_20;
class Triangle {
	double a,b,c;
	public Triangle() {
		a = 0.0;
		b = 0.0;
		c = 0.0;
	}
	public Triangle(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public double area() {
		double s;
		s = (a+b+c)/2;
		return Math.sqrt(s*(s-a)*(s-b)*(s-c));
	}
}
public class Ex4_20 {
	/**定义一个 Triangle 类表示三角形，其中包括三个 double 型变量 a、b、c 表示三条边长。
	 * 为该类定义两个构造方法：默认构造方法设置三角形的三条边长都为 0.0；带三个参数的构造方法通过传递三个参数创建三角形对象。
	 * 定义求三角形面积的方法 area，面积计算公式为 area=Math.sqrt(s*(s-a)*(s-b)*(s-c))，其中s=(a+b+c)/2。
	 * 编写另一个程序测试这个三角形类的所有方法*/
	public static void main(String[] args) {
		Triangle triangle = new Triangle(3, 4, 5);
		System.out.println(triangle.area());
	}
}
