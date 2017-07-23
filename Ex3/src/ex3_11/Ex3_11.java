package ex3_11;
import java.util.Scanner;
public class Ex3_11 {
	/**从键盘上输入一个百分制的成绩，输出五级制的成绩，要求使用switch结构实现*/
	public static void main(String[] args) {
		String grade = "";
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个百分制的成绩：");
		double score = scanner.nextDouble();
		switch ((int)(score / 10)) {
		case 10:
		case 9:
			grade = "优秀";
			break;
		case 8:
			grade = "良好";
			break;
		case 7:
			grade = "中等";
			break;
		case 6:
			grade = "及格";
			break;
		case 5:
		case 4:
		case 3:
		case 2:
		case 1:
		case 0:
			grade = "不及格";
			break;
		default:
			System.out.println("输入的成绩不正确.");
			break;
		}
		System.out.println("你的成绩为：" + grade);
		scanner.close();
	}
}
