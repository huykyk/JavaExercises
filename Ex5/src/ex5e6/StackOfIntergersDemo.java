package ex5e6;
import ex5e5.StackOfIntergers;
public class StackOfIntergersDemo {
	/**
	 * StackOfIntergers 类实现了栈的常用方法，
	 * 其中包括 push() 将一个整数存入栈中；
	 * pop 方法    元素出栈方法；
	 * peek 方法    返回栈顶元素但不出栈；
	 * empty 方法    返回栈是否为空；
	 * getSize 方法    返回栈中元素个数。
	 */
	public static void main(String[] args) {
		StackOfIntergers stack = new StackOfIntergers();
		//向栈中存入 10 个整数
		for (int i = 10; i < 20; i++) {
			stack.push(i);
		}
		//弹出栈中的所有元素
		while (!stack.empty()) {
			System.out.println(stack.pop() + " ");
		}
	}
}
