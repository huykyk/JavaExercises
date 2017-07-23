package ex3e2;
import java.util.Scanner;
public class LeapYear {
	/**从键盘上输入一个年份，输出该年是否是闰年*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入年份：");
		int year = sc.nextInt();
		if(year % 4 == 0 && year % 100 != 0 || year % 400 ==0){
			System.out.println(year + "年是闰年.");
		}else{
			System.out.println(year + "年不是闰年.");
		}
		sc.close();
	}
}
