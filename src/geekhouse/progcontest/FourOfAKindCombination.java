package geekhouse.progcontest;

import java.util.List;

public class FourOfAKindCombination extends OnePairCombination {
	@Override
	public boolean satisfy(List<Card> cards) {
		final List<Card> onePair = super.findOnePair(cards);
		if (onePair != null) {
			cards.removeAll(onePair);
			final List<Card> anotherOnePair = super.findOnePair(cards);
			if (onePair.get(0).getNum() == anotherOnePair.get(0).getNum()) {
				return true;
			}
		}
		return false;
	}
		
	public String toString() {
		return "four of a kind";
	};
}
