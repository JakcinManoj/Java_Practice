import java.util.Arrays;
import java.util.Random;

public class ArrayChallenge {
    public static void main(String[] args) {
        int[] array = new int[10];
        reverse(array);

    }

    private static int[] reverse(int[] array) {
        Random random = new Random();

        int[] reversed = new int[array.length];
        for (int i = 0; i < reversed.length; i++) {
            reversed[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(reversed));
        Arrays.sort(reversed);
        System.out.println(Arrays.toString(reversed));
        for (int i = array.length - 1; i >= 0; i--) {
            reversed[i] = array[i];
        }

        return reversed;

    }
}
