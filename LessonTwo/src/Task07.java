import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        int weekday = 0;
        Scanner inScaanner = new Scanner(System.in);
        System.out.print("\nвведите целое число >> ");

        weekday = inScaanner.nextInt();


        switch (weekday) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default: System.out.println("Error, wrong weekday number");
                System.out.println("вы ввели " + weekday);
        }

    }
}
