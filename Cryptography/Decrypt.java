package Cryptography;
import java.text.NumberFormat;
import java.text.ParsePosition;
import java.util.ArrayList;

class Result {

    /*
     * Complete the 'decryptMessage' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING encryptedMessage as parameter.
     */

    public static void main(String[] args) {
        String message = "seaside the to sent be to ne2d army ten of team a";
        decryptMessage(message);
    }

    public static String decryptMessage(String encryptedMessage) {
        String[] splitMessage = encryptedMessage.split(" ");
        String reversedMessage = "";

        // expand message
        for (int i = 0; i < splitMessage.length; i++) {
            // get current word
            String encryptedWord = splitMessage[i];
            String decryptedWord = "";

            System.out.println("Current word: " + encryptedWord);

            // investigate the characters
            char[] chars = encryptedWord.toCharArray();
            char previousChar = '_';
            for (int j = 0; j < chars.length; j++) {

                // check if number
                if (Character.isDigit(chars[j])) {

                    int amount = Character.getNumericValue(chars[j]) - 1;

                    System.out.println("amount: " + chars[j]);

                    int x = 1;
                    while (x <= amount) {
                        decryptedWord += previousChar;
                        x++;
                    }

                    
                } else {
                    decryptedWord += chars[j];
                }

            previousChar = chars[j];

            }

            System.out.println(i);

            splitMessage[i] = decryptedWord;

        }

        for (int i = splitMessage.length - 1; i >= 0; i--) {
            reversedMessage += splitMessage[i] + " ";
        }

        System.out.println(reversedMessage);

        return reversedMessage;
    }

}
