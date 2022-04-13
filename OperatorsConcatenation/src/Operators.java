public class Operators {
    public static void main(String[] args) {

        // Mathematical operators
        // + - * / %

        System.out.println(10 + 10);
        System.out.println(100 - 87);
        System.out.println(100 * 7);
        System.out.println(40 / 2);
        System.out.println(8 % 2);

        // Relational operators

        System.out.println( 7 == 9);
        System.out.println( 7 != 9);
        System.out.println(7 == 7 );
        System.out.println(4 + 4 < 9);
        System.out.println(8 <= 8);
        System.out.println(8 >= 8);

        // Logical operators
        System.out.println(7 <10 && 100 <10);
        System.out.println(100 < 1000 || 9 > 100);
        System.out.println(! (2 >10));

        // Assignment operators
        int number = 5;
        number++;
        number++;
        number++;
        System.out.println(number);

        int number2 = 8;
        number2 --;
        System.out.println(number2);

        int number3 = 10;
        number3 += 20;
        System.out.println(number3);
        number3 +=20;
        System.out.println(number3);


    }
}
