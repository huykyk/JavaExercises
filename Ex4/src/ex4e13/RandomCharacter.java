package ex4e13;

public class RandomCharacter {
	/**一般地，(int)(Math.random() * (a+1)) + b 返回 b~a+b 的随机数，包括 a+b
	 * 下面程序随机生成100个小写字母*/
	public static char getLetter() {
		return (char)('a' + Math.random() * ('z' - 'a' + 1));
	}
	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			System.out.print(getLetter() + " ");
			if (i % 20 == 0)
				System.out.println();	//每输出 20 个字母换行
		}
	}
}
