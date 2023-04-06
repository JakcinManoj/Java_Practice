import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if(isOdd(number)) {
            System.out.println("The number is odd");
        } else {
            System.out.println("The number is even");
        }
    }
    public static boolean isOdd(int number) {
        return number % 2 != 0 ? true : false;
    }

}
