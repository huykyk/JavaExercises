package ex3e13;

public class PickCards {
	/**��һ��ֽ���������ȡһ�ţ�����ӡ����ȡ������һ����
	 * ����ʹ�������ĳ���������ȷ������һ�ֻ�ɫ��������������ȷ������һ���ơ�*/
	public static void main(String[] args) {
		int card = (int)(Math.random()*53);
		String suit = "", rank = "";
		switch (card / 13) {	//ȷ���ƵĻ�ɫ
		case 0: suit = "����"; break;
		case 1: suit = "����"; break;
		case 2: suit = "÷��"; break;
		case 3: suit = "��Ƭ"; break;
		}
		switch (card % 13) {	//ȷ���ǵڼ�����
		case 0: rank = "A"; break;
		case 10: rank = "J"; break;
		case 11: rank = "Q"; break;
		case 12: rank = "K"; break;
		default: rank = "" + (card % 13 +1); break;
		}
		System.out.println("���ȡ�����ǣ�" + suit + " " + rank);
	}
}
