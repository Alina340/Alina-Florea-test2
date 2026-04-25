import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Introduceti trei numere: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();

        if(number1 == number2 && number2 == number3)
            System.out.println("Toate numerele sunt egale");
        else if (number1 != number2 && number2 != number3)
            System.out.println("Toate numerele sunt diferite");
        else
            System.out.println("Nici nu sunt egale, nici nu sunt diferie");



    }
}
