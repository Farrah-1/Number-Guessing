package projects.fw.guessMyNumber;

import java.util.Random;
import java.util.Scanner;

public class GuessMyNumber {
    public static String Guessing() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int count = 0;

        int randomNumber = random.nextInt(100) + 1;

        while (true) {

                int inputNumber = scanner.nextInt();
                count++;
                if (inputNumber == randomNumber) {
                    System.out.println("You guessed correctly");
                } else if (inputNumber > randomNumber) {
                    System.out.println("Guess is high");
                } else
                    System.out.println("Guess is low");

            }
    }

    public static void main(String[] args) {
        System.out.println(Guessing());
    }
}
