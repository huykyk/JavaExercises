package ex2;
class value {
	public int x,y;
	public value(int a,int b) {
		x = a;
		y = b;
	}
}
public class Ch31 {
	public static void main(String[] args) {
		int total;
		value num = new value(24, 65);
		total = num.x + num.y;
		System.out.println("add = " + total);
	}
}
