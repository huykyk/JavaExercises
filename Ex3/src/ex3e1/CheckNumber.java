package ex3e1;
import java.util.Scanner;
public class CheckNumber {
	/**从键盘上读取一个整数。检查该数是否能同时被5和6整除，是否能被5或被6整除，是否只能被5或只能被6整除*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个整数：");
		int num = sc.nextInt();
		if(num % 5 == 0 && num % 6 == 0){
			System.out.println(num + "能被5和6同时整除.");
		}
		if(num % 5 == 0 || num % 6 == 0){
			System.out.println(num + "能被5或6整除.");
		}
		if(num % 5 == 0 ^ num % 6 == 0){
			System.out.println(num + "能只被5或只被6整除.");
		}
		sc.close();
	}
}
