package ex4e3;

public class OverloadDemo {
	/**�����ж��������ط����󣬶����ط����ĵ�����һ�㷽���ĵ�����ͬ�����г����� OverloadDemo ���ж������ĸ����ص� show ����*/
	public void show() {
		System.out.println("No Parameters.");
	}
	public void show(int a, int b) {
		System.out.println("a = " + a + ",b = " + b);
	}
	public void show(double d) {
		System.out.println("d = " + d);
	}
	public void show(int a) {
		System.out.println("a = " + a);
	}
	public static void main(String[] args) {
		OverloadDemo od = new OverloadDemo();
		od.show();
		od.show(10);
		od.show(50, 60);
		od.show(100.0);
	}
}
