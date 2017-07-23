package ex6e12;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Replacement {
	public static void main(String[] args) throws Exception{
		//创建一个匹配 cat 的模式对象
		Pattern p = Pattern.compile("cat");
		//使用输入字符串创建一个匹配器对象
		Matcher m = p.matcher("One cat, two cats in the yard");
		StringBuffer sb = new StringBuffer();
		boolean result = m.find();
		//循环将模式替换为新字符串
		while (result) {
			m.appendReplacement(sb, "dog");
			result = m.find();
		}
		//将最后片段添加到新字符串中
		m.appendTail(sb);
		System.out.println(sb.toString());
	}
}
