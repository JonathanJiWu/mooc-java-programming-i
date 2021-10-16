
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Value of the gift?");
        int input = scan.nextInt();
        if (input < 5000) {
            System.out.println("No tax!");
        } else if (input < 25000) {
            System.out.println("Tax: " + (100 + (input - 5000) * .08));
        } else if (input < 55000) {
            System.out.println("Tax: " + (1700 + (input - 25000) * .1));
        } else if (input < 200000) {
            System.out.println("Tax: " + (4700 + (input - 55000) * .12));
        } else if (input < 1000000) {
            System.out.println("Tax: " + (22100 + (input - 200000) * .15));
        } else {
            System.out.println("Tax: " + (142100 + (input - 1000000) * .17));
        }
    }
}
