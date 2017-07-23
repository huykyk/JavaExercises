package ex3e16;
import java.util.Scanner;
public class PrintCalendar {
	/**提示用户从键盘上输入一个年份，打印该年的每月的月历*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter full year(e.g.2010):");
		int year = sc.nextInt();
		int startDay = CalculatWeekDay(year - 1, 13, 1);
		int month = 0;	//存储月份
		for (month = 1; month < 13; month++) {
			String monthName = "";
			switch (month) {
				case 1: monthName = "January"; break;
				case 2: monthName = "February"; break;
				case 3: monthName = "March"; break;
				case 4: monthName = "April"; break;
				case 5: monthName = "May"; break;
				case 6: monthName = "June"; break;
				case 7: monthName = "July"; break;
				case 8: monthName = "August"; break;
				case 9: monthName = "September"; break;
				case 10: monthName = "October"; break;
				case 11: monthName = "November "; break;
				case 12: monthName = "December"; break;
			}
			int daysOfMonth = 0;	//存储当前月的天数
			if (month == 1 || month == 3 || month == 5 || month == 7 
				|| month == 8 || month == 10 || month == 12) {
				daysOfMonth = 31;
			}
			if (month == 4 || month == 6 || month == 9 || month == 11) {
				daysOfMonth = 30;
			}
			if (month == 2) {
				if (year % 4 == 0 && year % 100 != 0 && year % 400 == 0) {
					daysOfMonth = 29;
				}else {
					daysOfMonth = 28;
				}
			}
			System.out.println("        " + monthName + "   " + year);
			System.out.println(" ---------------------------");
			System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
			int i;
			for (i = 0; i < startDay; i++) {
				System.out.print("    ");
			}
			for (i = 1; i <= daysOfMonth; i++) {
				System.out.printf("%4d", i);
				if ((startDay + i) % 7 ==0) {
					System.out.println();
				}
			}
			startDay = (startDay + daysOfMonth) % 7;
			System.out.println("\n");
		}
		sc.close();
	}
	static int CalculatWeekDay(int y,int m,int d) {
		/**采用基姆拉尔森计算公式
		 * Week=(Day + 2*Month + 3*(Month+1)/5 + Year + Year/4 - Year/100 + Year/400) % 7
		 * 注意：
		 * 1、该公式中要把1月和2月分别当成上一年的13月和14月处理。
		 * 例如：2008年1月4日要换成 2007年13月4日带入公式。
		 * 2、该式对应的与蔡勒公式有点区别：“0”为星期1，……，“6”为星期日。*/
		if(m==1) {
			m=13;
			y--;
		}
		if(m==2) {
			m=14;
			y--;
		}
		int week = (d + 2*m + 3*(m + 1)/5 + y + y/4 - y/100 + y/400) % 7;
		return week;
	}
}
