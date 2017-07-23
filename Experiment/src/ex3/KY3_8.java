package ex3;

class KY3_8 extends KY3_7_P {
	protected String xy;
	protected String xi;

	public static void main(String[] args) {
		KY3_7_P p1 = new KY3_7_P();
		p1.setData("帅零", 12321);
		p1.print();
		KY3_8 s1 = new KY3_8();
		s1.setData("郭丽娜", 123456);
		s1.xy = "经济管理学院";
		s1.xi = "信息管理系";
		s1.print();
		System.out.print(s1.xm + " , " + s1.xi);
	}
}
