package ex3;

class KY3_8 extends KY3_7_P {
	protected String xy;
	protected String xi;

	public static void main(String[] args) {
		KY3_7_P p1 = new KY3_7_P();
		p1.setData("˧��", 12321);
		p1.print();
		KY3_8 s1 = new KY3_8();
		s1.setData("������", 123456);
		s1.xy = "���ù���ѧԺ";
		s1.xi = "��Ϣ����ϵ";
		s1.print();
		System.out.print(s1.xm + " , " + s1.xi);
	}
}
