package com.tools;
import java.util.Scanner;
public class Input {
	public static int readInt() {
		Scanner scanner = new Scanner(System.in);
		return scanner.nextInt();
	}
	public static double readDouble() {
		Scanner scanner = new Scanner(System.in);
		return scanner.nextDouble();
	}
	public static String readString() {
		Scanner scanner = new Scanner(System.in);
		return scanner.nextLine();
	}
}
