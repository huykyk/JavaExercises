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
	/**����һ�� Triangle ���ʾ�����Σ����а������� double �ͱ��� a��b��c ��ʾ�����߳���
	 * Ϊ���ඨ���������췽����Ĭ�Ϲ��췽�����������ε������߳���Ϊ 0.0�������������Ĺ��췽��ͨ�����������������������ζ���
	 * ����������������ķ��� area��������㹫ʽΪ area=Math.sqrt(s*(s-a)*(s-b)*(s-c))������s=(a+b+c)/2��
	 * ��д��һ������������������������з���*/
	public static void main(String[] args) {
		Triangle triangle = new Triangle(3, 4, 5);
		System.out.println(triangle.area());
	}
}
