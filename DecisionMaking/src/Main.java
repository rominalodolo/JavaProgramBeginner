import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Please enter your age: ");
        int age = reader.nextInt();
        if(age>= 18){
            System.out.println("You are an adult.");
        }else{
            System.out.println("You're too young.");
        }
        System.out.println("The program is over.");
    }
}
