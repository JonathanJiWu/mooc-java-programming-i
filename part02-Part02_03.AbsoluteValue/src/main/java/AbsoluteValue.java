
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        if (n1<0){
            System.out.println(n1*-1);
        } else {
            System.out.println(n1);
        }
    }
}
