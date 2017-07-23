package ex6e12;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Replacement {
	public static void main(String[] args) throws Exception{
		//����һ��ƥ�� cat ��ģʽ����
		Pattern p = Pattern.compile("cat");
		//ʹ�������ַ�������һ��ƥ��������
		Matcher m = p.matcher("One cat, two cats in the yard");
		StringBuffer sb = new StringBuffer();
		boolean result = m.find();
		//ѭ����ģʽ�滻Ϊ���ַ���
		while (result) {
			m.appendReplacement(sb, "dog");
			result = m.find();
		}
		//�����Ƭ����ӵ����ַ�����
		m.appendTail(sb);
		System.out.println(sb.toString());
	}
}
