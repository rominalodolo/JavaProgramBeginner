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


    }
}
