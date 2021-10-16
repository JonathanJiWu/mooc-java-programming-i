
import java.util.Scanner;

public class CheckingTheAge {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("How old are you?");
        int input = scan.nextInt();
        if (input<0 || input> 120){
            System.out.println("Impossible!");
        } else {
            System.out.println("OK");
        }
    }
}
