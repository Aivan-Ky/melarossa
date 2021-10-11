import java.util.Arrays;

public class Homework2 {
    public static void main(String[] args) {
        int algorithmID = Integer.parseInt(args[0]);
        int loopType = Integer.parseInt(args[1]);
        int n = Integer.parseInt(args[2]);

        int factorialOfn = 1;
        int[] fibonacciSequence = new int[n];  // !!!!!!!!! записывать результат в число long!!!!!!!

        int a = 0, b = 1; // переменные для вычисления ряда Фибоначчи
        int i = 0;


        if (algorithmID == 2) { // вычисление факториала
            if (loopType == 1) { // n! циклом while
                i = 1;
                while (i <= n) {
                    factorialOfn *= i;
                    i++;
                }

            } else if (loopType == 2) { // n! циклом do-while
                i = 1;
                do {
                    factorialOfn = factorialOfn * i;
                    i++;
                } while (i <= n);

            } else if (loopType == 3) { // n! циклом for
                for (i = 1; i <= n; i++) {
                    factorialOfn *= i;
                }

            } else {
                System.out.println("параметр loopType задан неверно");
                return;
            }
            System.out.println("факториал числа " + n + ": " + factorialOfn);


        } else if (algorithmID == 1) { // вычисление ряда чисел Фибоначчи
            if (loopType == 3) { // ряд Фибоначчи циклом for
                for (i = 0; i < n; i++) {
                    fibonacciSequence[i] = a;
                    a = a + b;
                    b = a - b;
                }
            } else if (loopType == 1) { // ряд Фибоначчи циклом while
                while (i < n) {
                    fibonacciSequence[i] = a;
                    a = a + b;
                    b = a - b;
                    i++;
                }
            } else if (loopType == 2) { // ряд Фибоначчи циклом do-while
                do {
                    fibonacciSequence[i] = a;
                    a = a + b;
                    b = a - b;
                    i++;
                } while (i < n);
            } else {
                System.out.println("параметр loopType задан неверно");
                return;
            }
            System.out.println("первые " + n + " чисел ряда Фибоначчи: " + Arrays.toString(fibonacciSequence));


        } else {
            System.out.println("параметр algorithmID задан неверно");
        }

    }
}
