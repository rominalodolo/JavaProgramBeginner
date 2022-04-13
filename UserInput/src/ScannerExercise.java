import java.util.Scanner;

public class ScannerExercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1.
        System.out.println("What profession do you want to have next year?");
        String desigedProfession =sc.nextLine();
        System.out.println("Keep up the good work and next year you will be a " + desigedProfession);

        // 2.
        Scanner reader = new Scanner(System.in)
        System.out.println("Welcome to the system. How old are you? ");
        int age = reader.nextInt();
        System.out.println("Oh I see. You're " + age + " years old.");
        System.out.printf("Oh I see, you're %d years old.", age);

        // 3.
        Scanner reader1 = new Scanner(System.in);
        System.out.println("Please enter your sex (M or F): ");
        char gender = reader1.next().charAt(0);
        System.out.println("You picked " + gender);
        System.out.printf("You picked %c", gender);

        // 4.
        Scanner reader2 = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int n1 = reader2.nextInt();
        System.out.println("Enter the second number: ");
        int n2 = reader2.nextInt();
        System.out.println("Enter the third number: ");
        int n3 = reader2.nextInt();

        int sum = n1 + n2 + n3;
        int diff = n1 = n2 - n3;
        int product = n1 * n2 * n3;
        double average = sum / 3;

        System.out.printf("The sum is equal to %d \n The difference is equal to %d \n" + " The product is equal to %d \n The average is equal to %f", sum, diff, product, average);


    }
}
