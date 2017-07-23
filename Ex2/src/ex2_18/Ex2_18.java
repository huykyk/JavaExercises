package ex2_18;
import java.util.Scanner;
public class Ex2_18 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input weight(kg):");
		double weight = sc.nextDouble();
		System.out.println("Please input height(m):");
		double height = sc.nextDouble();
		double bmi = weight/(height*height);
		System.out.println("BMI = "+bmi);
		sc.close();
	}
}
