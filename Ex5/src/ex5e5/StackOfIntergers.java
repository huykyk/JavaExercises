package ex5e5;

public class StackOfIntergers {
	/**			һ������ջ��
	 * ջ��һ�ֺ���ȳ������ݽṹ���ڼ��������Ӧ�ù㷺��
	 * ���Զ���һ����ģ��ջ�ṹ��
	 * Ϊ���������ջ�д�� int ����ֵ��
	 * 
	 * element:ջ����Ԫ��    capacity:ÿ��ջ��������    size:ջ��Ԫ�ظ���
	 */
	private int[] elements;
	private int size = 0;
	public static final int DEFAULT_CAPACITY = 10;
	
	public StackOfIntergers() {
		this(DEFAULT_CAPACITY);
	}
	public StackOfIntergers(int capacity) {
		elements = new int[capacity];
	}
	//��ջ����
	public void push(int value) {
		if (size >= elements.length) {
	//����һ��������ԭ���鳤�� 2 ��������
			int[] temp = new int[elements.length * 2];
	//��ԭ������Ԫ�ظ��Ƶ���������
			System.arraycopy(elements, 0, temp, 0, elements.length);
			elements = temp;
		}
		elements[size++] = value;
	}
	//��ջ����
	public int pop() {
		return elements[--size];
	}
	//����ջ��Ԫ�ط���
	public int peek() {
		return elements[size-1];
	}
	//�пշ���
	public boolean empty() {
		return size == 0;
	}
	public int getSize() {
		return size;
	}
}
