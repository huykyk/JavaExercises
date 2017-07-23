package ex5e2;

public class EnhancedForDemo {
	/** 下列程序演示了一个元素为字符串的对象数组的使用 */
	public static void main(String[] args) {
		String[] season = { "Spring", "Summer", "Fall", "Winter" };
		for (String element : season) {
			System.out.print("  " + element);
		}
	}
}
