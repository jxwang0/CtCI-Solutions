public class One
{
	public enum Suit 
	{
		HEARTS, CLUBS, SPADES, DIAMONDS
	}
	public class Card
	{
		int num;
		Suit suit;
	}

	public abstract class CardCollection
	{
		ArrayList <Card> cards;
	}

	public class Deck extends CardCollection
	{
		public Hand deal(){..};
		public void shuffle(){..};
		public Card draw(){..};
		public List<Card> drawMultiple(int num){..};
	}

	public class BlackJackHand extends CardCollection
	{
		public Card hiddenCard;
	}

	public class BlackJackGame
	{
		public Map <Integer> scores; 
		public int calculatePoints(BlackJackHand hand){..};
		

	}



}