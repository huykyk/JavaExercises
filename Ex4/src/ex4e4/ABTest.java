package ex4e4;

class AB {
	int a,b;											//a, b�ǳ�Ա����
	public void init(int x) {
		a = x;
		int b = 5;										//�ֲ����� b �����˳�Ա���� b
		System.out.println("a = " + a + ",b = " + b);	//����� b �Ǿֲ�����
	}
	public void display() {
		System.out.println("a = " + a + ",b = " + b);	//����� b �ǳ�Ա����
	}
}
public class ABTest {
	/**this�ؼ��ֱ�ʾ��������һ�������ķ����������У�Ҳ�����������Ա����ͬ���ľֲ���������ʱ�ľֲ����������س�Ա������Ҫʹ�ó�Ա��������Ҫ��ǰ����� this �ؼ���*/
	public static void main(String[] args) {
		AB ab = new AB();
		ab.display();
		ab.init(6);
		ab.display();
	}
}
