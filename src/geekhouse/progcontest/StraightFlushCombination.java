package geekhouse.progcontest;

import java.util.List;

public class StraightFlushCombination extends StraightCombination implements Combination {
	
	private Combination flushCombination = new FlushCombination();

	@Override
	public boolean satisfy(List<Card> cards) {
		if (super.satisfy(cards) && flushCombination.satisfy(cards)) {
			return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
			return "staight flush";
	}

}
