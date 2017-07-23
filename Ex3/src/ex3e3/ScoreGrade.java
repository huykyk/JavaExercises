package ex3e3;
import java.util.Scanner;
public class ScoreGrade {
	/**输入学生的百分制成绩，打印输出等级的成绩*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入成绩：");
		double score = sc.nextDouble();
		String grade = "";
		if(score > 100 || score < 0){
			System.out.println("输入的成绩不正确.");
			System.exit(0);	//结束程序运行
		}else if(score >= 90){
			grade = "优秀";
		}else if(score >= 80){
			grade = "良好";
		}else if(score >= 70){
			grade = "中等";
		}else if(score >= 60){
			grade = "及格";
		}else{
			grade = "不及格";
		}
		System.out.println("你的成绩为：" + grade);
		sc.close();
	}
}
