package ex3e5;
import java.util.Scanner;
public class StringSwitchDemo {
	/**�����·ݵ��ַ���������������·�*/
	public static void main(String[] args) {
		String month = "";
		int monthNum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ���·ݵ�Ӣ�����ƣ�");
		month = sc.next();
		switch (month.toLowerCase()) {
		case "january": monthNum = 1; break;
		case "february": monthNum = 2; break;
		case "march": monthNum = 3; break;
		case "april": monthNum = 4; break;
		case "may": monthNum = 5; break;
		case "june": monthNum = 6; break;
		case "july": monthNum = 7; break;
		case "august": monthNum = 8; break;
		case "september": monthNum = 9; break;
		case "october": monthNum = 10; break;
		case "november": monthNum = 11; break;
		case "december": monthNum = 12; break;
		default:
			monthNum = 0;
			break;
		}
		if(monthNum == 0){
			System.out.println("������·����Ƿ�");
		}else {
			System.out.println(month + "��" + monthNum + "��");
		}
		sc.close();
	}
}
