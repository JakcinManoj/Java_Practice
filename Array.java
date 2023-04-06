public class Array {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;
        int[] reversed = new int[numbers.length];
        for (int i = numbers.length - 1; i >= 0; i--) {
            sum += numbers[i];
            reversed[i] = numbers[i];
            System.out.print(reversed[i]+ " ");
        }
        System.out.println("\n");
        for (int element : numbers){
            System.out.println("\n"+"Using Advanced For Loop : "+element + " ");
        }
        System.out.println("\n"+sum);
    }
}
