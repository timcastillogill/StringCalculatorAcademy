public class StringCalculator {
    public static int Add(String numbers) {
        if (numbers == "") {
            return 0;
        }
        return Integer.parseInt(numbers);
    }
}
