import java.util.Scanner;

public class Clock {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int second = 0, minute = 0, hour = 0;

        System.out.print("Time | " + String.format("%02d", minute) + ":" + String.format("%02d", second));

        while (true) {

            // String key = input.nextLine();

            if (second + 1 < 60) {
                second++;
            } else {
                if (minute + 1 < 60) {
                    minute++;
                } else {
                    if (hour + 1 < 24) {
                        hour++;
                    } else {
                        hour = 0;
                    }

                    minute = 0;
                }
                second = 0;
            }

            System.out.print("\033[H\033[2J");
            System.out.flush();

            System.out.println("Time | " + String.format("%02d", hour) + ":" + String.format("%02d", minute) + ":"
                    + String.format("%02d", second));

        }
    }
}
