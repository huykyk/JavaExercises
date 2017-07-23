package ex5e4;

public class DeckOfCards {
	/**				�����ȡ������
	 * ��һ���� 52 �ŵ�ֽ���������ȡ 4 �ţ���ӡ����ȡ�����ļ����ơ� 
	 * �ȶ���һ���� 52 ��Ԫ�ص���Ϊ deck �����飬��0~51�����ЩԪ�ء�
	 * int[] deck = new int[52];
	 * for (int i = 0; i < deck.length; i++)
	 * deck[i] = i;
	 * ��Ԫ��ֵ��0~12Ϊ���ң�13~25Ϊ���ң�26~38Ϊ���飬39~51Ϊ÷����
	 * Ȼ�����ÿ��Ԫ�ص��ƺ�ֵ��ϴ�ƣ���֮�����ȡ��ǰ4���ƣ� 
	 * �����cardNumber/13 ȷ����ɫ���� cardNumber%13 ȷ������һ���ơ�
	 */
	public static void main(String[] args) {
		int[] deck = new int[52];
		String[] suits = { "����", "����", "����", "÷��" };
		String[] ranks = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
		// ��ʼ��ÿһ����
		for (int i = 0; i < deck.length; i++) {
			deck[i] = i;
		}
		// �����ƵĴ���
		for (int i = 0; i < deck.length; i++) {
			// �������һ��Ԫ���±�0~51
			int index = (int) (Math.random() * deck.length);
			int temp = deck[i];
			deck[i] = deck[index];
			deck[index] = temp;
		}
		// ��ʾ���ǰ 4 ����
		for (int i = 0; i < 4; i++) {
			String suit = suits[deck[i] / 13]; // ȷ����ɫ
			String rank = ranks[deck[i] % 13]; // ȷ������
			System.out.println("��" + (i + 1) + "������:  " + suit + "  " + rank);
		}
	}
}
