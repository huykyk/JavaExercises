package ex4e7;

public class SomeClass {
	/**实例方法与静态方法的区别是：实例方法可以对当前的实例变量进行操作，也可以对静态变量进行操作，但静态方法只能访问静态变量。实例方法必须由对象来调用，而静态方法除了可以由对象调用外，还可以由类名直接调用。另外在静态方法中不能使用 this 和 super 关键字*/
	static int i = 48;
	int j = 5;
	public static void display() {
		i = i + 100;
		System.out.println("i = " + i);
		//j = j * 5;	该语句会产生编译错误
		//System.out.println("j = " +j);
	}
}
