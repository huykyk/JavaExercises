package ex3e4;
import java.util.Scanner;
public class SwitchDemo {
	/**�Ӽ�������һ����ݺ�һ���·ݣ�������µ�����*/
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
		case 2:	//����2����Ҫ�ж��Ƿ�������
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
