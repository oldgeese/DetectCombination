package geekhouse.progcontest;

import java.util.List;

public interface Combination {
	boolean satisfy(List<Card> cards);
	String toString();
}
