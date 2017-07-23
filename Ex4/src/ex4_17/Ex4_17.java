package ex4_17;
import java.util.Scanner;
class Person {
	String name;
	int age;
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void speak() {
		System.out.println("name:" + name);
		System.out.println("age:" + age);
	}
}
public class Ex4_17 {
	/**定义一个名为 Person 的类，其中含有一个 String 类型的成员变量 name 和一个 int 类型的
	 * 成员变量 age，分别为这两个变量定义访问方法和修改方法，另外再为该类定义一个名为 speak 的方法，
	 * 在其中输出其 name 和 age 的值。编写程序，使用上面定义的 Person 类，实现数据的访问、修改*/
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Person person = new Person();
		System.out.println("Please input name:");
		person.setName(scanner.nextLine());
		System.out.println("Please input age:");
		person.setAge(scanner.nextInt());
		person.speak();
		scanner.close();
	}
}
