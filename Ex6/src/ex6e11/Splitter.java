package ex6e11;

import java.util.regex.Pattern;

public class Splitter {
	public static void main(String[] args) throws Exception{
		//创建一个模式对象
		Pattern p = Pattern.compile("[,\\s]+");
		//使用模式对象对输入字符串分解
		String[] result = p.split("one,two, three  four,  five");
		for (int i = 0; i < result.length; i++) {
			System.out.print("|" + result[i] + "|,");
		}
	}
}
