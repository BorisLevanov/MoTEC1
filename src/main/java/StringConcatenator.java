package main.java;
import java.util.Scanner;

class StringConcatenator {

    /**
     * @param seasonOfYear - i.e. Summer, Winter
     * @param adjective - descriptive, i.e. cold, warm
     * @param integer - amount of cups of water one would drink
     * @return
     */
    static String assembleString(String seasonOfYear, String adjective, int integer) {
        String resultingString = "On a " + seasonOfYear + " " + adjective +
                " day, I drink a minimum of " + integer +
                " cups of coffee.";
        System.out.println(resultingString);
        return resultingString;
    }

    static void ConcatenateString() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a season of the year:");
        String season = scanner.next();

        System.out.println("Enter a whole number:");
        int number = scanner.nextInt();

        System.out.println("Enter an adjective:");
        String adjective = scanner.next();

        scanner.close();
        assembleString(adjective, season, number);
    }
}