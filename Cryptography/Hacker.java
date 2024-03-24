package Cryptography;
import java.util.Random;
import java.util.Scanner;

public class Hacker {

    public static final String ALPHABET = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ .,";

    public static void main(String[] args) throws InterruptedException {

        Scanner input = new Scanner(System.in);

        Random random = new Random();

        String word = "Lorem ipsum, dolor sit amet consectetur adipisicing elit. Ullam, exercitationem mollitia illum non inventore in officia iure obcaecati quaerat ut saepe tempora dolorum";

        // store natin sa array yung word para icompare sa guess array
        char[] wordToGuess = word.toCharArray();
        char[] guessChars = new char[word.length()];

        // gagamitin natin to keep track the indexes ng guessChars array that are already correctly guessed - starting from the end 
        int indexFromLastChar = 0;

        while (true) {

            Thread.sleep(50);

            int currentIndex = word.length() - indexFromLastChar;

            if (currentIndex == 0) {
                break;
            }

            // generate a random string
            for (int i = 0; i < currentIndex; i++) {
                char randomChar = (ALPHABET.charAt(random.nextInt(ALPHABET.length())));
                guessChars[i] = randomChar;
            }

            if (guessChars[currentIndex-1] == wordToGuess[currentIndex-1]) {
                indexFromLastChar++;

            }

            System.out.println(guessChars);
            
        }
        

    }
}
