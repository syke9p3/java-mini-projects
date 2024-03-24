package Poker;

public class Card {

    public static final char SPADES = 'S';
    public static final char HEARTS = 'H';
    public static final char DIAMONDS = 'D';
    public static final char CLUBS = 'C';

    private int rank;   
    private int suit;

    public Card(int rank, int suit) {
        this.rank = rank;
        this.suit = suit;
    }

    //  _________
    // |2        |
    // |         |
    // |         |
    // |         |
    // |_________|
    // 

    public void printCard(String format) {

        if (format.equals("str")) {
            System.out.print("" + rank + " of " + suitToStr(suit));
        } else if (format.equals("char")){
            System.out.print("" + rankToChar(rank) + suitToChar(suit));
        }
    }    

    public char rankToChar(int rank) {
        switch (rank) {
            case 1:
                return 'A'; // Ace
            case 2:
                return '2';
            case 3:
                return '3';
            case 4:
                return '4';
            case 5:
                return '5';
            case 6:
                return '6';
            case 7:
                return '7';
            case 8:
                return '8';
            case 9:
                return '9';
            case 10:
                return 'T'; // Ten
            case 11:
                return 'J'; // Jack
            case 12:
                return 'Q'; // Queen
            case 13:
                return 'K'; // King
            default:
                return '_'; 
        }
    }
    
    public char suitToChar(int suit) {
        switch (suit) {
            case 1:
                return 'S';
            case 2:
                return 'H';
            case 3:
                return 'D';
            case 4:
                return 'C';
            default:
                return '_'; 
        }
    }

    public String suitToStr(int suit) {
        switch (suit) {
            case 1:
                return "Spades";
            case 2:
                return "Hearts";
            case 3:
                return "Diamonds";
            case 4:
                return "Clubs";
            default:
                return "______"; 
        }
    }
    
    
}