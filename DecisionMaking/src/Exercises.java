import javax.sound.midi.Soundbank;
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
        System.out.println("I'm going to ask you for three numbers...");
        System.out.println("Enter your first number: ");
        int first = reader.nextInt();
        System.out.println("Enter your second number: ");
        int second = reader.nextInt();
        System.out.println("Enter your third number: ");
        int third = reader.nextInt();

        int smallest = first;
        if (second < smallest){
            smallest = second;
        }else if(third < smallest){
            smallest = third;
        }
        System.out.println("The smallest number you gave is " + smallest);

//        5.
        System.out.println("Please enter your age: ");
        int age = reader.nextInt();
        System.out.println("Now enter the age you would like to retire at: ");
        int retire = reader.nextInt();


    }
}
