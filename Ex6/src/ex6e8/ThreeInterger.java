package ex6e8;

public class ThreeInterger {
	public static void main(String[] args) {
		int max, min, a, b, c;
		a = Integer.parseInt(args[0]);			//���ַ���ת��Ϊ����
		b = Integer.parseInt(args[1]);
		c = Integer.parseInt(args[2]);
		
		max = Math.max(Math.max(a, b), c);		//�� a, b, c �����ֵ
		min = Math.min(Math.min(a, b), c);
		System.out.println("max = " + max);
		System.out.println("min = " + min);
	}
}
