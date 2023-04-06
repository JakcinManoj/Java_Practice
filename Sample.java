
public class Sample {
    public static void main(String[] args) {
        System.out.println("Hello World");
        String[] splitStrings = "I love Java".split(" ");
        printText(splitStrings);
    }

    private static void printText(String[] splitStrings) {
        for (String string : splitStrings) {
            System.out.println(string);
        }
    }
    
}
