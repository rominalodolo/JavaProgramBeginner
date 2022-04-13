public class Concatenation {
    public static void main(String[] args) {
        int number = 10;
        String text = "test";
        double doubleNum = 11.1;
        float floatNum = 11.1F;
        boolean truth = true;
        char c = '*';
        System.out.println("My string variable has the value " + text);
        System.out.println("My number is " + number);
        System.out.println("My Double number is " + doubleNum);
        System.out.println("My Float number is " + floatNum);
        System.out.println("I have declared a character with the value " + c);


        System.out.println();

        System.out.printf("I have declared a string variable with the value %s", text);

        System.out.println();

        System.out.printf("I have declared an integer variable with the value %d", number);
        System.out.printf("I have declared an double variable with the value %f and a string with the value %s", doubleNum, text);
        System.out.println();
        System.out.printf("We are declaring a boolean %b " + truth);
    }
}
