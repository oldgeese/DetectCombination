package geekhouse.progcontest;

import java.util.List;

public class FullHouseCombination extends ThreeOfAKindCombination {
	OnePairCombination onePairCombination = new OnePairCombination();

	@Override
	public boolean satisfy(List<Card> cards) {
		final List<Card> threeOfAKindCards = super.findThreeOfAKind(cards);

		if (threeOfAKindCards != null) {
			cards.removeAll(threeOfAKindCards);
			return (onePairCombination.findOnePair(cards) != null);
		}

		return false;
	}
	
	@Override
	public String toString() {
		return "full house";
	}
}
