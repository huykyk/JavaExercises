package ex4e2;

import ex4e1.Circle;

public class CircleTest {
	/**������Ϳ��Դ�������ָ������ĳ�ʼ״̬��Ȼ��ͨ�����ö���ķ���ʵ�ֶ���Ĳ��������г���ʹ�� Circle ��������뾶��Բ���ܳ������*/
	public static void main(String[] args) {
		Circle cc;
		cc = new Circle();		//����һ��Circle�����
		cc.setRadius(10);
		System.out.println("�뾶 = " + cc.radius);
		System.out.println("�ܳ� = " + cc.perimeter());
		System.out.println("��� = " + cc.area());
	}
}
