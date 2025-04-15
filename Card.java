import java.util.Random;

public class Card {
    private String suit;
    private String face;

    public Card(String face, String suit) {
        this.face = face;
        this.suit = suit;
    }

    public String toString() {
        return face + " of " + suit;
    }

    public static Card getRandomCard() {
        String[] suits = { "Hearts", "Diamonds", "Clubs", "Spades" };
        String[] faces = { "2", "3", "4", "5", "6", "7", "8", "9", "10", 
                           "Jack", "Queen", "King", "Ace" };
        Random rand = new Random();
        return new Card(faces[rand.nextInt(faces.length)], suits[rand.nextInt(suits.length)]);
    }
}

