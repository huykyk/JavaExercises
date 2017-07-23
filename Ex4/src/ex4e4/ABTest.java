package ex4e4;

class AB {
	int a,b;											//a, b是成员变量
	public void init(int x) {
		a = x;
		int b = 5;										//局部变量 b 隐藏了成员变量 b
		System.out.println("a = " + a + ",b = " + b);	//这里的 b 是局部变量
	}
	public void display() {
		System.out.println("a = " + a + ",b = " + b);	//这里的 b 是成员变量
	}
}
public class ABTest {
	/**this关键字表示对象本身。在一个方法的方法体或参数中，也可能声明与成员变量同名的局部变量，此时的局部变量会隐藏成员变量。要使用成员变量就需要在前面加上 this 关键字*/
	public static void main(String[] args) {
		AB ab = new AB();
		ab.display();
		ab.init(6);
		ab.display();
	}
}
