package ex3e1;
import java.util.Scanner;
public class CheckNumber {
	/**�Ӽ����϶�ȡһ���������������Ƿ���ͬʱ��5��6�������Ƿ��ܱ�5��6�������Ƿ�ֻ�ܱ�5��ֻ�ܱ�6����*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ��������");
		int num = sc.nextInt();
		if(num % 5 == 0 && num % 6 == 0){
			System.out.println(num + "�ܱ�5��6ͬʱ����.");
		}
		if(num % 5 == 0 || num % 6 == 0){
			System.out.println(num + "�ܱ�5��6����.");
		}
		if(num % 5 == 0 ^ num % 6 == 0){
			System.out.println(num + "��ֻ��5��ֻ��6����.");
		}
		sc.close();
	}
}
