package ex5e7;

public class VarargsTest {
	/**在方法参数列表的最后一个参数的类型名之后、参数名之前使用省略号，即可定义可变参数的方法*/
	public static double avg(int ... values) {
		double sum = 0;
		for (int value : values) {
			sum = sum + value;		//求数组元素之和
		}
		double avg = sum / values.length;
		return avg;
	}
	public static void main(String[] args) {
		System.out.println(avg(60, 70, 86));
	}
}
