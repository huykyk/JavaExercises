package ex2_19;
import java.util.Scanner;
public class Ex2_19 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("��������������ʣ�");
		double rate = sc.nextDouble();
		System.out.println("����������ܽ�");
		double amount = sc.nextDouble();
		System.out.println("���������������");
		double year = sc.nextDouble();
		double mAmount = amount*(rate/12)/(1-(1/Math.pow((1+(rate/12)), year*12)));
		double aAmount = mAmount*12*year;
		System.out.println("��֧����"+mAmount);
		System.out.println("�ܳ�����"+aAmount);
		sc.close();
	}
}
