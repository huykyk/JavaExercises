package ex6e11;

import java.util.regex.Pattern;

public class Splitter {
	public static void main(String[] args) throws Exception{
		//����һ��ģʽ����
		Pattern p = Pattern.compile("[,\\s]+");
		//ʹ��ģʽ����������ַ����ֽ�
		String[] result = p.split("one,two, three  four,  five");
		for (int i = 0; i < result.length; i++) {
			System.out.print("|" + result[i] + "|,");
		}
	}
}
