package ex4e5;

import ex4e1.Circle;

public class PassByValue {
	/**�� Java �����У������Ĳ��������ǰ�ֵ���ݣ����ڵ��÷���ʱ��ʵ�ʲ�����ֵ��һ���������ݸ������е���ʽ�������������ý�����ʵ�ʲ�����ֵ�����ı䡣��ʽ�����Ǿֲ���������������ֻ�ڷ����ڲ����뿪�������Զ��ͷš�
	 * ���ܲ��������ǰ�ֵ���ݵģ������ڻ����������͵Ĳ����������������͵Ĳ����Ĵ��ݻ��ǲ�ͬ�ġ����ڻ����������͵Ĳ������ǽ�ʵ�ʲ���ֵ��һ���������ݸ��������������ý����󣬶�ԭ����ֵû��Ӱ�졣��������������������ʱ��ʵ�ʴ��ݵ�������ֵ������ڷ������ڲ��п��ܸı�ԭ���Ķ���*/
	public void change(int y) {
		y = y * 2;
		System.out.println("y = " + y);
	}
	public void change(Circle cc) {
		cc.setRadius(100);
	}
	public static void main(String[] args) {
		PassByValue pv = new PassByValue();
		int x = 100;
		pv.change(x);
		System.out.println("x = " + x);
		Circle c = new Circle();
		c.setRadius(10);
		System.out.println("c �İ뾶 = " + c.getRadius());
		pv.change(c);
		System.out.println("c �İ뾶 = " + c.getRadius());
	}
}
