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
	/**����һ����Ϊ Person ���࣬���к���һ�� String ���͵ĳ�Ա���� name ��һ�� int ���͵�
	 * ��Ա���� age���ֱ�Ϊ����������������ʷ������޸ķ�����������Ϊ���ඨ��һ����Ϊ speak �ķ�����
	 * ����������� name �� age ��ֵ����д����ʹ�����涨��� Person �࣬ʵ�����ݵķ��ʡ��޸�*/
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
