import java.util.Scanner;
public class Sandbox {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write your program here
        System.out.println("Please enter first number: ");
        int num1 = scanner.nextInt();
        System.out.println("Please enter second number: ");
        int num2 = scanner.nextInt();
        int num3 = num1 + num2;
        System.out.println("The sum of the two numbers is "+num3);
    }
}
