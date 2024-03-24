package Poker;

public class Deck {

    private final int numOfRanks = 13;
    private final int numOfSuits = 4;

    Card[][] deck = new Card[4][13]; 

    public Deck() {
        initializeDeck();
    }

    public void initializeDeck() {
        for(int i = 1; i <= numOfRanks; i++) {
            for (int j = 1; j <= numOfSuits; j++) {
                // System.out.println("i: " + i + ", j: " + j);
                Card card = new Card(i, j);
                deck[j-1][i-1] = card;
            }
        }
    }

    public void printDeck() {
        for(int i = 0; i < numOfRanks; i++) {
            for (int j = 0; j < numOfSuits; j++) {
                deck[j][i].printCard("char");
                System.out.print("\t");
            }
            System.out.println("");
        }
    }
    
}
