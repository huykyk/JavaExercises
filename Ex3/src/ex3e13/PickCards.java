package ex3e13;

public class PickCards {
	/**从一副纸牌中任意抽取一张，并打印出抽取的是哪一张牌
	 * 可以使用整数的除法运算来确定是哪一种花色，用求余数运算确定是哪一张牌。*/
	public static void main(String[] args) {
		int card = (int)(Math.random()*53);
		String suit = "", rank = "";
		switch (card / 13) {	//确定牌的花色
		case 0: suit = "黑桃"; break;
		case 1: suit = "红桃"; break;
		case 2: suit = "梅花"; break;
		case 3: suit = "方片"; break;
		}
		switch (card % 13) {	//确定是第几张牌
		case 0: rank = "A"; break;
		case 10: rank = "J"; break;
		case 11: rank = "Q"; break;
		case 12: rank = "K"; break;
		default: rank = "" + (card % 13 +1); break;
		}
		System.out.println("你抽取的牌是：" + suit + " " + rank);
	}
}
