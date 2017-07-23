package ex3_14;

public class Ex3_14 {
	/**编写程序，求出所有的水仙花数*/
	public static void main(String[] args) {
		for (int i = 100; i < 1000; i++) {
			int a = i / 100;		//百位
			int b = i / 10 % 10;	//十位
			int c = i % 10;			//个位
			if (Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3) == i) {
				System.out.println(i);
			}
		}
	}
}
