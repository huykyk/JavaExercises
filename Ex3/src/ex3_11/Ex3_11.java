package ex3_11;
import java.util.Scanner;
public class Ex3_11 {
	/**�Ӽ���������һ���ٷ��Ƶĳɼ�������弶�Ƶĳɼ���Ҫ��ʹ��switch�ṹʵ��*/
	public static void main(String[] args) {
		String grade = "";
		Scanner scanner = new Scanner(System.in);
		System.out.println("������һ���ٷ��Ƶĳɼ���");
		double score = scanner.nextDouble();
		switch ((int)(score / 10)) {
		case 10:
		case 9:
			grade = "����";
			break;
		case 8:
			grade = "����";
			break;
		case 7:
			grade = "�е�";
			break;
		case 6:
			grade = "����";
			break;
		case 5:
		case 4:
		case 3:
		case 2:
		case 1:
		case 0:
			grade = "������";
			break;
		default:
			System.out.println("����ĳɼ�����ȷ.");
			break;
		}
		System.out.println("��ĳɼ�Ϊ��" + grade);
		scanner.close();
	}
}
