package geekhouse.progcontest;

import java.util.List;

public class StraightCombination implements Combination {

	@Override
	public boolean satisfy(List<Card> cards) {
		
		if (isSpecial(cards)) {
			cards.remove(0);
			return satisfyStraight(cards);
		}
		
		return satisfyStraight(cards);
	}

	private boolean satisfyStraight(List<Card> cards) {
		Card current = cards.get(0);
		for(Card each:cards.subList(1, cards.size())) {
			if (current.compareTo(each) != -1) {
				return false;
			}
			current = each;
		}
		return true;
	}
	
	public boolean isSpecial(List<Card> cards) {
		Card first = cards.get(0);
		Card last = cards.get(cards.size()-1);
		
		if (first.getNum()==1 && last.getNum()==13) {
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "straight";
	}
}
