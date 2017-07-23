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
	/**定义一个名为 Rectangle 的类表示矩形，其中含有 length、width 两个 double 型的成员变量表示矩形的长和宽。
	 * 要求为每个变量定义访问方法和修改方法，定义求矩形周长的方法 perimeter 和求面积的方法 area。
	 * 定义一个带参数构造方法，通过给出的长和宽创建矩形对象。
	 * 定义默认构造方法，在该方法中调用有参构造方法，将矩形长宽都设置为 1.0。
	 * 编写程序测试这个矩形类的所有方法*/
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
