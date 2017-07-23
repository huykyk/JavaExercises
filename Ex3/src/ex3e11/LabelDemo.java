package ex3e11;

public class LabelDemo {
	/**在循环体中使用带标签的 break 语句和 continue 语句*/
	public static void main(String[] args) {
		outer:
		for (int i = 0; i < 3; i++) {
			System.out.println("i = " + i);
			inner:
			for (int j = 0; j < 100; j++) {
				if (j == 20) {
					break outer;
				}
				if (j % 3 == 0) {
					continue inner;
				}
				System.out.print(j + "  ");
			}
			System.out.println("This will not be print.");
		}
		System.out.println();
		System.out.println("Loop Finish");
	}
}
