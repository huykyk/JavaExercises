package ex4e17;
import static java.lang.Math.*;
import static java.lang.System.*;
public class StaticTest {
	/**要使用 Math 类的 random() 等，就可以先使用静态导入语句，然后在程序中就可以直接使用 random() 了*/
	public static void main(String[] args) {
		double d = random();
		double pi = PI;
		out.println("d = " + d);
		out.print("pi = " + pi);
	}
}
