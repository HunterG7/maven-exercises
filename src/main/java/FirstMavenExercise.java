import java.util.Scanner;

import static org.apache.commons.lang3.StringUtils.*;

public class FirstMavenExercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Something:");
        String userInput = sc.nextLine();

        if (isNumeric(userInput)){
            System.out.printf("%s is a number.%n", userInput);
        } else {
            System.out.printf("%s is not a number.%n", userInput);
        }

        String flippedCasing = swapCase(userInput);
        System.out.printf("Flipped Case: %s%n", flippedCasing);

        String reversedString = reverse(userInput);
        System.out.printf("Reversed: %s%n", reversedString);

    }
}
