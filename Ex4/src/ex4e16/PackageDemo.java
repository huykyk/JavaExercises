package ex4e16;
import java.util.*;
import java.sql.*;
public class PackageDemo {
	/**如果用“*”号这种方式导入的类有同名的类，在使用时应指明类的全名*/
	public static void main(String[] args) {
		java.util.Date d = new java.util.Date();
		System.out.println("d = " + d);
	}
}
