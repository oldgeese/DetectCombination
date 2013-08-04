package geekhouse.progcontest;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class DetectCombination {

	public static void main(String[] args) {
		if (args.length != 5) {
			throw new IllegalArgumentException("5枚のカード情報を入力してください。");
		}

		List<Card> cards = createCards(args);
		Collections.sort(cards);

		for (Combination each : createCombinations()) {
			
			if (each.satisfy(cards)) {
				System.out.println(each.toString());
				return;
			}
		}
	}

	private static List<Card> createCards(String[] args) {
		List<Card> cards = new LinkedList<Card>();
		for (String each : args) {
			cards.add(new Card(each));
		}

		return cards;
	}

	private static List<Combination> createCombinations() {
		List<Combination> c = new LinkedList<Combination>();
		c.add(new StraightFlushCombination());
		c.add(new FourOfAKindCombination());
		c.add(new FullHouseCombination());
		c.add(new FlushCombination());
		c.add(new StraightCombination());
		c.add(new ThreeOfAKindCombination());
		c.add(new TwoPairCombination());
		c.add(new OnePairCombination());
		c.add(new HighCardsCombination());

		return c;
	}

}
