package ex4e12;
import static java.lang.Math.*;
import static java.lang.System.*;
public class RoundDemo {
	/**���г�����ʾ�� Math ��� round ������rint �����ͳ��� PI ��ʹ��*/
	public static void main(String[] args) {
		out.println("rint(2.5) = " + rint(2.5));
		out.println("rint(-3.5) = " + rint(-3.5));
		out.println("round(2.5) = " + round(2.5));
		out.println("round(-3.5) = " + round(-3.5));
		double pi = PI;
		pi = round(pi*10000)/10000.0;
		out.println("PI = " + pi);
	}
}
