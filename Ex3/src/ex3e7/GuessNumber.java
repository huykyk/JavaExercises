package ex3e7;
import java.util.Scanner;
public class GuessNumber {
	/**�������һ�� 100~200 ���������û��Ӽ������������µ�����������ʾ�Ƿ���е���Ϣ�����û�в���Ҫ���û������£�ֱ������Ϊֹ*/
	public static void main(String[] args) {
		int magic = (int)(Math.random()*101)+100;
		Scanner sc = new Scanner(System.in);
		System.out.println("��������µ�����");
		int guess = sc.nextInt();
		while (guess != magic) {
			if(guess > magic){
				System.out.println("����̫�����ز£�");
			}else {
				System.out.println("����̫С�����ز£�");
			}
			guess = sc.nextInt();
		}
		System.out.println("��ϲ�㣬����ˣ�\n�����ǣ�" + magic);
		sc.close();
	}
}
