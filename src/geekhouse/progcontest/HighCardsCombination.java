package geekhouse.progcontest;

import java.util.List;

public class HighCardsCombination implements Combination {

	@Override
	public boolean satisfy(List<Card> cards) {
		return true;
	}
	
	@Override
	public String toString() {
		return "high cards";
	}

}
