package ex3;

class People {
	protected double weight, height;

	public void speakHello() {
		System.out.println("Hello!");
	}

	public void averageHeight() {
		height = 173;
		System.out.println("Average height:" + height);
	}

	public void averageWeight() {
		weight = 70;
		System.out.println("Average weight:" + weight);
	}
}

class ChinaPeople extends People {
	@Override
	public void speakHello() {
		System.out.println("��ã�");
	}

	@Override
	public void averageHeight() {
		height = 167;
		System.out.println("ƽ����ߣ�" + height);
	}

	@Override
	public void averageWeight() {
		weight = 66;
		System.out.println("ƽ�����أ�" + weight);
	}

	public void chinaWushu() {
		System.out.println("������");
	}
}

public class c5_1 {

	public static void main(String[] args) {
		ChinaPeople s1 = new ChinaPeople();
		People s2 = new People();
		s1.speakHello();
		s1.averageHeight();
		s1.averageWeight();
		s1.chinaWushu();
		s2.averageHeight();
	}

}
