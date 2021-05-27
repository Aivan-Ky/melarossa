import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        System.out.print("введите число вещественное число n >> ");
        Scanner inScanner = new Scanner(System.in);
        double n = inScanner.nextDouble();

        double roundedMethodOne = Math.round(n);
        double roundedMethodTwo = Math.floor(n);
        double roundedMethodThree = Math.ceil(n);


        System.out.println(n);
        System.out.println(roundedMethodOne);
        System.out.println(roundedMethodTwo);
        System.out.println(roundedMethodThree);

    }
}
