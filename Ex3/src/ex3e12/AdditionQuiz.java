package ex3e12;
import java.util.Scanner;
public class AdditionQuiz {
	/**����ʼ���������������һλ������ѧ������������������������Ƿ���ȷ*/
	public static void main(String[] args) {
		int num1 = (int)(Math.random()*10);
		int num2 = (int)(Math.random()*10);
		Scanner sc = new Scanner(System.in);
		System.out.print(num1 + " + " + num2 + " = ");
		int ans = sc.nextInt();
		if (ans == num1 + num2) {
			System.out.println("��ϲ�㣬����ˣ�");
		}else {
			System.out.println("���ź�������ˣ�");
			System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
		}
		sc.close();
	}
}
