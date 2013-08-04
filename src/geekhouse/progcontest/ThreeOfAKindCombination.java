package geekhouse.progcontest;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ThreeOfAKindCombination implements Combination {

	@Override
	public boolean satisfy(List<Card> cards) {
		return (findThreeOfAKind(cards) != null);
	}

	protected List<Card> findThreeOfAKind(List<Card> cards) {
		Card current = new Card("0s");
		Iterator<Card> iter = cards.iterator();
		while (iter.hasNext()) {
			Card each = iter.next();
			if (current.getNum() == each.getNum()) {
				Card next = iter.next();
				if (current.getNum() == next.getNum()) {
					return Arrays.asList(new Card[] { current, each, next });
				} else {
					current = next;
					continue;
				}
			}

			current = each;
		}

		return null;
	}

	@Override
	public String toString() {
		return "three of a kind";
	}

}
