package ex4_18;
import java.util.Scanner;
class Rectangle {
	double length,width;
	public Rectangle() {
		length = 1.0;
		width = 1.0;
	}
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	public double getLength() {
		return length;
	}
	public double getWidth() {
		return width;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double perimeter() {
		return 2 * (length + width);
	}
	public double area() {
		return length * width;
	}
}
public class Ex4_18 {
	/**����һ����Ϊ Rectangle �����ʾ���Σ����к��� length��width ���� double �͵ĳ�Ա������ʾ���εĳ��Ϳ�
	 * Ҫ��Ϊÿ������������ʷ������޸ķ���������������ܳ��ķ��� perimeter ��������ķ��� area��
	 * ����һ�����������췽����ͨ�������ĳ��Ϳ������ζ���
	 * ����Ĭ�Ϲ��췽�����ڸ÷����е����вι��췽���������γ�������Ϊ 1.0��
	 * ��д��������������������з���*/
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Rectangle rectangle = new Rectangle();
		System.out.println("length:" + rectangle.getLength() + ", width:" + rectangle.getWidth());
		Rectangle rectangle2 = new Rectangle(2.0, 2.0);
		System.out.println("length:" + rectangle2.getLength() + ", width:" + rectangle2.getWidth());
		System.out.println("Please input length & width:");
		rectangle.setLength(scanner.nextDouble());
		rectangle.setWidth(scanner.nextDouble());
		System.out.println("length:" + rectangle.getLength() + ", width:" + rectangle.getWidth());
		System.out.println("perimeter:" + rectangle.perimeter() + ", area:" + rectangle.area());
		scanner.close();
	}
}
