import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {

        Scanner inScanner = new Scanner(System.in);
        System.out.print("\nвведите целое число >> ");
        int hourNumber = inScanner.nextInt();

        if ((hourNumber >= 5) && (hourNumber <= 11)) {
            System.out.println("Good morning!");
        } else if ((hourNumber >= 12) && (hourNumber <= 16)) {
            System.out.println("Good day!");
        } else if ((hourNumber >= 17) && (hourNumber <= 21)) {
            System.out.println("Good evening!");
        } else if (((hourNumber >= 22) && (hourNumber <= 24))
                || ((hourNumber >= 0) && (hourNumber <= 4))) {
            System.out.println("Good night!");
        } else
            System.out.println("You entered " + hourNumber + ". Are we still at the planet Earth ?");
    }
}
