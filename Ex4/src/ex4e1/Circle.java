package ex4e1;

public class Circle {
	/**����˵ Java ����һ�ж��Ƕ���Ҫ��õ��������ȱ��붨���ࣨҲ����ʹ�����ȶ���õ��ࣩ��Ȼ�󴴽�����*/
	public double radius;					//��Ա����
	
	public void setRadius(double r) {		//��Ա����
		radius = r;
	}
	public double getRadius() {
		return radius;
	}
	public double perimeter() {
		return 2 * Math.PI * radius;
	}
	public double area() {
		return Math.PI * radius *radius;
	}
}
