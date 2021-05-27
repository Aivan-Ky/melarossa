public class Task01 {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);

        if (y != 0) {

            int divisionResult = x / y;
            int divisionRemainder = x % y;
            double squareRoot = Math.sqrt(Double.parseDouble(args[0]));


            System.out.println("результат целочисленного деления " + x + " на " + y + " = " + divisionResult);
            System.out.println("остаток от деления " + x + " на " + y + " = " + divisionRemainder);
            System.out.println("квадратный корень числа " + x + " = " + squareRoot);
        } else
            System.out.println("число " + y + " = 0");
    }
}
