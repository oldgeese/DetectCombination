package geekhouse.progcontest;

import java.util.Arrays;
import java.util.List;

public class OnePairCombination implements Combination{

	@Override
	public boolean satisfy(List<Card> cards) {
		return (findOnePair(cards) != null); 
	}

	protected List<Card> findOnePair(List<Card> cards) {
		Card current = new Card("0s");
		for(Card each:cards) {
			if (current.getNum() == each.getNum()) {
				return Arrays.asList(new Card[] {current, each});
			}
			
			current = each;
		}
		
		return null;
	}
	
	@Override
	public String toString() {
		return "one pair";
	}

}
