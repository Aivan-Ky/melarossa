// вариант с пустой строкой

import java.util.Arrays;

public class StringSort {
    public static void main(String[] args) {
        String inputString = "Once upon a time a Wolf was lapping at a spring " +
                "on a hillside, when, looking up, what should he see but " +
                "a Lamb just beginning to drink a little lower down.";
        String lowerCaseOnlyString = inputString.toLowerCase();
        String noDotsAndCommasString = lowerCaseOnlyString.replaceAll("\\p{Punct}", "");

        String[] wordsFromInputString = noDotsAndCommasString.split("\\s+");
        int arrayLength = wordsFromInputString.length;
        int stringLength = inputString.length();

        System.out.println(inputString + " - has " + stringLength + " characters");
        System.out.println(Arrays.toString(wordsFromInputString) + " - has " + arrayLength + " words");
        System.out.println(inputString.matches("(.*)[^0-9](.*)"));


    }
}
