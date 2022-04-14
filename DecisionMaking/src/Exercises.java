import java.util.Scanner;

public class Exercises {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

//        1.
        System.out.println("Enter the first number: ");
        int num1 = reader.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = reader.nextInt();
        if (num1 == num2){
            System.out.println("The numbers are the same");
        }else{
            System.out.println("The numbers are NOT the same.");
        }

//        2.
        System.out.println("Enter a number: ");
        int number = reader.nextInt();
        if (number %2 == 0){
            System.out.println("The number is even.");
        }else{
            System.out.println("The number is odd.");
        }

//        3.
        System.out.println("Provide a number: ");
        int num = reader.nextInt();
        if (num < 0){
            System.out.println("The number is negative.");
        }else{
            System.out.println("The number is positive.");
        }

//        4.

        
    }
}
