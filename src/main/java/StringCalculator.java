import java.lang.reflect.Array;

public class StringCalculator {
    public static int Add(String numbers) {
        int result = 0;
        String[] numbersArray = getStrings(numbers);
        if (numbers.length() < 1) {return result;}
        for (String s : numbersArray) {
            result += Integer.parseInt(s);
        }
        return result;
    }

    private static String[] getStrings(String numbers) {
        return numbers.split(",|\n");
    }
}
