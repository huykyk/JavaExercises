package ex3e3;
import java.util.Scanner;
public class ScoreGrade {
	/**����ѧ���İٷ��Ƴɼ�����ӡ����ȼ��ĳɼ�*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ɼ���");
		double score = sc.nextDouble();
		String grade = "";
		if(score > 100 || score < 0){
			System.out.println("����ĳɼ�����ȷ.");
			System.exit(0);	//������������
		}else if(score >= 90){
			grade = "����";
		}else if(score >= 80){
			grade = "����";
		}else if(score >= 70){
			grade = "�е�";
		}else if(score >= 60){
			grade = "����";
		}else{
			grade = "������";
		}
		System.out.println("��ĳɼ�Ϊ��" + grade);
		sc.close();
	}
}
