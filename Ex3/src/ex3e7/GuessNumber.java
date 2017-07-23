package ex3e7;
import java.util.Scanner;
public class GuessNumber {
	/**随机产生一个 100~200 的整数，用户从键盘上输入所猜的数，程序显示是否猜中的消息，如果没有猜中要求用户继续猜，直到猜中为止*/
	public static void main(String[] args) {
		int magic = (int)(Math.random()*101)+100;
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入你猜的数：");
		int guess = sc.nextInt();
		while (guess != magic) {
			if(guess > magic){
				System.out.println("错误！太大，请重猜：");
			}else {
				System.out.println("错误！太小，请重猜：");
			}
			guess = sc.nextInt();
		}
		System.out.println("恭喜你，答对了！\n该数是：" + magic);
		sc.close();
	}
}
