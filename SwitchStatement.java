public class SwitchStatement{
    public static void main(String[] args) {
        switchStatement(1);
    }

    public static void switchStatement(int number) {
        String data = switch (number) {
            case 1 ->
            { yield "1"; }
            case 2 ->
                "2";
            case 3, 4, 5->
                "3, 4 or 5";
            default->
                "Value was not 1, 2, 3, 4 or 5";
        };
        System.out.println("The value is " + data);
    }
}