public class PositiveNegative {
    public static void main(String[] args) {
        checkNumber(-5);
    }
    public static void checkNumber(int number) {
        String result = (number >= 0) ? "Positive" : (number < 0) ? "Negative" : "Zero";
        System.out.println(result);
    }
}