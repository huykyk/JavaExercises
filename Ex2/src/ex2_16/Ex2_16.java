package ex2_16;
import java.util.Scanner;
public class Ex2_16 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double fahrenheit,centigrade;
		System.out.println("Please input a fahrenheit:");
		fahrenheit = sc.nextDouble();
		centigrade = ((double)5/9)*(fahrenheit-32);
		System.out.println("You input"+centigrade+"¡ãC.");
		sc.close();
	}
}
