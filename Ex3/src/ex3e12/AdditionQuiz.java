package ex3e12;
import java.util.Scanner;
public class AdditionQuiz {
	/**程序开始运行随机生成两个一位数，让学生输入计算结果，程序给出结果是否正确*/
	public static void main(String[] args) {
		int num1 = (int)(Math.random()*10);
		int num2 = (int)(Math.random()*10);
		Scanner sc = new Scanner(System.in);
		System.out.print(num1 + " + " + num2 + " = ");
		int ans = sc.nextInt();
		if (ans == num1 + num2) {
			System.out.println("恭喜你，答对了！");
		}else {
			System.out.println("很遗憾，答错了！");
			System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
		}
		sc.close();
	}
}
