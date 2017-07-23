package ex2_19;
import java.util.Scanner;
public class Ex2_19 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入贷款年利率：");
		double rate = sc.nextDouble();
		System.out.println("请输入贷款总金额：");
		double amount = sc.nextDouble();
		System.out.println("请输入贷款年数：");
		double year = sc.nextDouble();
		double mAmount = amount*(rate/12)/(1-(1/Math.pow((1+(rate/12)), year*12)));
		double aAmount = mAmount*12*year;
		System.out.println("月支付金额："+mAmount);
		System.out.println("总偿还金额："+aAmount);
		sc.close();
	}
}
