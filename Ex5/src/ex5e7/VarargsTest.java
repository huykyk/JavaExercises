package ex5e7;

public class VarargsTest {
	/**�ڷ��������б�����һ��������������֮�󡢲�����֮ǰʹ��ʡ�Ժţ����ɶ���ɱ�����ķ���*/
	public static double avg(int ... values) {
		double sum = 0;
		for (int value : values) {
			sum = sum + value;		//������Ԫ��֮��
		}
		double avg = sum / values.length;
		return avg;
	}
	public static void main(String[] args) {
		System.out.println(avg(60, 70, 86));
	}
}
