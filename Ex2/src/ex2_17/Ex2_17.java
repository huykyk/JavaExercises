package ex2_17;
import java.util.Scanner;
public class Ex2_17 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input redius:");
		double redius = sc.nextDouble();
		System.out.println("Please input height:");
		double height = sc.nextDouble();
		double v = Math.PI*redius*redius*height;
		System.out.println("V = "+v);
		sc.close();
	}
}
