package ex3e2;
import java.util.Scanner;
public class LeapYear {
	/**�Ӽ���������һ����ݣ���������Ƿ�������*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("��������ݣ�");
		int year = sc.nextInt();
		if(year % 4 == 0 && year % 100 != 0 || year % 400 ==0){
			System.out.println(year + "��������.");
		}else{
			System.out.println(year + "�겻������.");
		}
		sc.close();
	}
}
