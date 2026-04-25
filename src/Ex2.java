import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Introduceti numarul: ");
        int number = input.nextInt();

        if(number < 0)
            System.out.println("Numarul este negativ!");
        else
            System.out.println("Numarul este pozitiv!");
    }
}
