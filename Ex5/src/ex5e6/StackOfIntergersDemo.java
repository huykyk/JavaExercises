package ex5e6;
import ex5e5.StackOfIntergers;
public class StackOfIntergersDemo {
	/**
	 * StackOfIntergers ��ʵ����ջ�ĳ��÷�����
	 * ���а��� push() ��һ����������ջ�У�
	 * pop ����    Ԫ�س�ջ������
	 * peek ����    ����ջ��Ԫ�ص�����ջ��
	 * empty ����    ����ջ�Ƿ�Ϊ�գ�
	 * getSize ����    ����ջ��Ԫ�ظ�����
	 */
	public static void main(String[] args) {
		StackOfIntergers stack = new StackOfIntergers();
		//��ջ�д��� 10 ������
		for (int i = 10; i < 20; i++) {
			stack.push(i);
		}
		//����ջ�е�����Ԫ��
		while (!stack.empty()) {
			System.out.println(stack.pop() + " ");
		}
	}
}
