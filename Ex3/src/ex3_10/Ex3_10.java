package ex3_10;

public class Ex3_10 {
	/**求解「鸡兔同笼问题」：鸡和兔在一个笼里，共有腿100条，头40个，问鸡兔各有几只*/
	public static void main(String[] args) {
		for (int x = 0; x < 40; x++) {
			for (int y = 0; y < 40; y++) {
				if (2 * x + 4 * y == 100 & x + y == 40) {
					System.out.println("有鸡" + x + "只，鸭" + y + "只");
				}
			}
		}
	}
}
