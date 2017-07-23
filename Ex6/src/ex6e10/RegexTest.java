package ex6e10;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String regex, inputString;
		System.out.println("Enter your String:");
		inputString = input.next();
		System.out.println("Enter your regex:");
		regex = input.next();
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(inputString);
		boolean found = false;
		while (matcher.find()) {
			System.out.format("I Found the text \"%s\" string at " + "index %d and ending at index %d. %n", matcher.group(), matcher.start(), matcher.end());
			found = true;
		}
		if (!found) {
			System.out.println("No match found. %n");
		}
		input.close();
	}
}
