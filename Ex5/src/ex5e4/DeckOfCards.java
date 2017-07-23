package ex5e4;

public class DeckOfCards {
	/**				随机抽取四张牌
	 * 从一副有 52 张的纸牌中随机抽取 4 张，打印出抽取的是哪几张牌。 
	 * 先定义一个有 52 个元素的名为 deck 的数组，用0~51填充这些元素。
	 * int[] deck = new int[52];
	 * for (int i = 0; i < deck.length; i++)
	 * deck[i] = i;
	 * 设元素值从0~12为黑桃，13~25为红桃，26~38为方块，39~51为梅花。
	 * 然后打乱每个元素的牌号值（洗牌），之后从中取出前4张牌， 
	 * 最后用cardNumber/13 确定花色，用 cardNumber%13 确定是哪一张牌。
	 */
	public static void main(String[] args) {
		int[] deck = new int[52];
		String[] suits = { "黑桃", "红桃", "方块", "梅花" };
		String[] ranks = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
		// 初始化每一张牌
		for (int i = 0; i < deck.length; i++) {
			deck[i] = i;
		}
		// 打乱牌的次序
		for (int i = 0; i < deck.length; i++) {
			// 随机产生一个元素下标0~51
			int index = (int) (Math.random() * deck.length);
			int temp = deck[i];
			deck[i] = deck[index];
			deck[index] = temp;
		}
		// 显示输出前 4 张牌
		for (int i = 0; i < 4; i++) {
			String suit = suits[deck[i] / 13]; // 确定花色
			String rank = ranks[deck[i] % 13]; // 确定次序
			System.out.println("第" + (i + 1) + "张牌是:  " + suit + "  " + rank);
		}
	}
}
