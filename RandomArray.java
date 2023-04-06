import java.util.Arrays;
import java.util.Random;
public class RandomArray {
    public static void main(String[] args) {
        int[] randomArray = getRandomArray(10);
        System.out.println(Arrays.toString(randomArray));
        Arrays.sort(randomArray);
        System.out.println(Arrays.toString(randomArray));
    }

    private static int[] getRandomArray(int length) {
        Random random = new Random();
        int[] randomArray = new int[length];
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = random.nextInt(100);
        }
        return randomArray;
    }

    
}
