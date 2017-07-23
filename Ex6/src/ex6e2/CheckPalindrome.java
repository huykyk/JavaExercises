package ex6e2;

import java.util.Scanner;

public class CheckPalindrome {
	public static boolean isPalindrome(String s) {
		int low = 0;
		int high = s.length() - 1;
		while (low < high) {
			if (s.charAt(low) != s.charAt(high)) {
				return false;
			}
			low ++;
			high --;
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ���ַ�����");
		String s = sc.nextLine();
		if (isPalindrome(s)) {
			System.out.println(s + " �ǻ���");
		} else {
			System.out.println(s + " ���ǻ���");
		}
		sc.close();
	}
}
