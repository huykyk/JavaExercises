package ex4e8;

class Member {
	int instanceVar;
	static int classVar;
	void setInstanceVar(int i) {
		instanceVar = i;
		classVar = i;		//实例方法可以访问静态变量
	}
	int getInstanceVar() {
		return instanceVar;
	}
	static void setClassVar(int i) {
		classVar = i;
		//instanceVar = i;	该语句错误，静态方法不能访问实例变量
	}
	static int getClassVar() {
		return classVar;
	}
}
public class MemberTest {
	/**下列程序说明了实例变量、实例方法和静态变量与静态方法的使用*/
	public static void main(String[] args) {
		Member m1 = new Member(),
			   m2 = new Member();
		m1.setInstanceVar(100);
		m2.setInstanceVar(200);
		m1.setClassVar(300);
		System.out.print("m1.instanceVar = " + m1.getInstanceVar());
		System.out.println("	m1.classVar = " + m1.getClassVar());
		System.out.print("m2.instanceVar = " + m2.getInstanceVar());
		System.out.println("	m2.classVar = " + m2.getClassVar());
	}
}
