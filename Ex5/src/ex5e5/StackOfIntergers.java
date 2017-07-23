package ex5e5;

public class StackOfIntergers {
	/**			一个整数栈类
	 * 栈是一种后进先出的数据结构，在计算机领域应用广泛。
	 * 可以定义一个类模拟栈结构。
	 * 为简单起见，设栈中存放 int 类型值。
	 * 
	 * element:栈区块元素    capacity:每个栈区块容量    size:栈中元素个数
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
	//进栈方法
	public void push(int value) {
		if (size >= elements.length) {
	//创建一个长度是原数组长度 2 倍的数组
			int[] temp = new int[elements.length * 2];
	//将原来数组元素复制到新数组中
			System.arraycopy(elements, 0, temp, 0, elements.length);
			elements = temp;
		}
		elements[size++] = value;
	}
	//出栈方法
	public int pop() {
		return elements[--size];
	}
	//返回栈顶元素方法
	public int peek() {
		return elements[size-1];
	}
	//判空方法
	public boolean empty() {
		return size == 0;
	}
	public int getSize() {
		return size;
	}
}
