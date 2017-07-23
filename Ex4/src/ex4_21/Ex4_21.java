package ex4_21;

import com.tools.Input;

public class Ex4_21 {
	/**编写一个名为 Input 的类，该类属于 com.tools 包。
	 * 使用该类实现各种数据类型（字符型除外）数据输入，其中的方法有 readInt()、readDouble()、readString() 等。
	 * 在用户程序中通过调用 Input.readDouble() 即可从键盘上输入 double 型数据。*/
	public static void main(String[] args) {
		double d = Input.readDouble();
		System.out.println("d = " + d);
		int i = Input.readInt();
		System.out.println("i = " + i);
		String s = Input.readString();
		System.out.println("s = " + s);
	}
}
