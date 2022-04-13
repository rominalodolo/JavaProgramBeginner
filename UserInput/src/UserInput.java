import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        Scanner readerText = new Scanner(System.in);


        System.out.println("Please enter a text: ");
        String insertedText = reader.nextLine();
        System.out.println("You entered text: " + insertedText);

        System.out.println("Please enter a number: ");
        int insertedNumber = reader.nextInt();
        System.out.println("You have entered the number " + insertedNumber);

        System.out.println(" Please enter a double number, with a comma instead of a dot: ");
        double insertedDouble = reader.nextDouble();
        System.out.println("You have entered a double number: " + insertedDouble); // use a comma

        System.out.println("Please enter a text: ");
        String insertedText2 = readerText.nextLine();
        System.out.println("You entered text: " + insertedText2);

        System.out.println("Please enter a float number(please use a comma for this system): ");
        float insertedFloat = reader.nextFloat();
        System.out.println("You have entered a float number: " + insertedFloat);

        System.out.println("Please enter a long number: ");
        long insertedLong = reader.nextLong();
        System.out.println("You have entered a long number: " + insertedLong);

        System.out.println("Please enter a boolean: ");
        boolean myBoolean = reader.nextBoolean();
        System.out.println("You have entered a boolean " + myBoolean);

        System.out.println("Please Enter a character value: ");
        char insertedChar = reader.next().charAt(0);
        System.out.println("Provided char: " + insertedChar);
    }
}
