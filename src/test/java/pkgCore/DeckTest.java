package pkgCore;

import static org.junit.Assert.*;

import org.junit.Test;

import pkgEnum.eRank;
import pkgEnum.eSuit;
import pkgException.DeckException;

public class DeckTest {

	@Test
	public void TestEmptyDeck() throws DeckException{
		//TODO: Build a deck, draw until you get a DeckException
		Deck Deck1 = new Deck();
		boolean flag = false;
		try {
		for (int i = 1; i <= 100; i++) {
			Deck1.Draw();
		}Deck1.Draw();}
		catch(DeckException e) {
			flag = true;
			assertTrue(flag);
		}
	}
	
	@Test
	public void TestDrawSuit() {
		//TODO: Build a deck, test the Draw(eSuit) method
		Deck Deck1 = new Deck();
		Card Card1 = Deck1.Draw(eSuit.DIAMONDS);
		assertTrue(Card1.geteSuit() == eSuit.DIAMONDS);
	}
	
	@Test
	public void TestDrawRank() {
		//TODO: Build a deck, test the Draw(eRank) method
		Deck Deck1 = new Deck();
		Card Card1 = Deck1.Draw(eRank.KING);
		assertTrue(Card1.geteRank() == eRank.KING);
	}
	
	public void TestDeckRankCount() {
		//TODO: Build a deck, test the DeckRankCount method
		Deck Deck1 = new Deck();
		assertEquals(Deck1.Count(eRank.EIGHT), 4);
	}
	
	public void TestDeckSuitCount() {
		//TODO: Build a deck, test the DeckSuitCount method
		Deck Deck1 = new Deck();
		assertEquals(Deck1.Count(eSuit.CLUBS), 13);
	}

}
