package ex4_21;

import com.tools.Input;

public class Ex4_21 {
	/**��дһ����Ϊ Input ���࣬�������� com.tools ����
	 * ʹ�ø���ʵ�ָ����������ͣ��ַ��ͳ��⣩�������룬���еķ����� readInt()��readDouble()��readString() �ȡ�
	 * ���û�������ͨ������ Input.readDouble() ���ɴӼ��������� double �����ݡ�*/
	public static void main(String[] args) {
		double d = Input.readDouble();
		System.out.println("d = " + d);
		int i = Input.readInt();
		System.out.println("i = " + i);
		String s = Input.readString();
		System.out.println("s = " + s);
	}
}
