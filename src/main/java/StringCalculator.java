import java.lang.reflect.Array;

public class StringCalculator {
    public static int Add(String numbers) {
        int result = 0;
        String[] numbersArray = numbers.split(",");
        int i = 0;
        if (numbers.length() < 1) {
            return result;
        }
        for (String number : numbersArray) {
            result += Integer.parseInt(numbersArray[i]);
            i++;
        }
        return result;
    }
}
