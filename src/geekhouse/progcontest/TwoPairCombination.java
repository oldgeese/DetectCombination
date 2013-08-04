package geekhouse.progcontest;

import java.util.List;

public class TwoPairCombination extends OnePairCombination implements Combination{
	
	@Override
	public boolean satisfy(List<Card> cards) {
		final List<Card> onePair = super.findOnePair(cards);
		if (onePair != null) {
			cards.removeAll(onePair);
			return (super.findOnePair(cards) != null);
		}
		return false;
	}
		
	public String toString() {
		return "two pair";
	};
}
