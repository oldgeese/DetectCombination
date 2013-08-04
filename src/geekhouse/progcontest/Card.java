package geekhouse.progcontest;


public class Card implements Comparable<Card>{
	private Suit suit;

	public Suit getSuit() {
		return suit;
	}

	public int getNum() {
		return num;
	}

	private int num;

	private static final String specials = "ATJQK";

	Card(String cardStr) {
		final String numStr = cardStr.substring(0, 1);
		final String suitStr = cardStr.substring(1, 2);
		suit = Suit.valueOf(suitStr);
		num = toNum(numStr);
	}

	protected int toNum(String numStr) {
		final int i = specials.indexOf(numStr);
		if (i == 0) {
			return 1;
		} else if (i > 0) {
			return i + 9;
		}

		return Integer.valueOf(numStr);
	}
	
	public String toString() {
		return this.suit + Integer.toString(this.num);
	}

	@Override
	public int compareTo(Card o) {
		return this.num - o.getNum();
	}
}
