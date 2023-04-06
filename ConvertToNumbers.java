public class ConvertToNumbers {
    public static void main(String[] args) {
        System.out.println(convertToNumber(5));
        System.out.println("The data is send from here ...." + convertToNumber(0, 5));
    }

    public static int convertToNumber(int number) {
        // converts inches to centimeters
        return (int) (number * 2.54);
    }

    public static double convertToNumber(int feetNumber, int number) {
        // converts feet and inches to centimeters
        return (int) ((feetNumber * 12 + number) * 2.54);
    }
}
