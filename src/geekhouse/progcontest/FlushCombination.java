package geekhouse.progcontest;

import java.util.List;

public class FlushCombination implements Combination {

	@Override
	public boolean satisfy(List<Card> cards) {
		Card current = cards.get(0);
		cards.remove(0);
		for(Card each:cards) {
			if (current.getSuit() != each.getSuit()) {
				return false;
			}
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		return "flush";
	}

}
