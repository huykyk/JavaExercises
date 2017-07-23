package ex3e4;
import java.util.Scanner;
public class SwitchDemo {
	/**从键盘输入一个年份和一个月份，输出该月的天数*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a year:");
		int year = sc.nextInt();
		System.out.println("Enter a month:");
		int month = sc.nextInt();
		int numDays = 0;
		switch (month) {
		case 1: case 3: case 5:
		case 7:	case 8: case 10:
		case 12:
			numDays = 31;
			break;
		case 4: case 6: case 9:
		case 11:
			numDays = 30;
		case 2:	//对于2月需要判断是否是闰年
			if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
				numDays = 29;
			}else {
				numDays = 28;
			}
			break;
		default:
			System.out.println("Illegal month number!");
			break;
		}
		System.out.println("The month have " + numDays +" days.");
		sc.close();
	}
}
