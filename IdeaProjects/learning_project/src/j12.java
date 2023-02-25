//even odd
import java.util.Scanner;
public class j12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value: ");
        int i;
        i = in.nextInt();
        if (i%2==0) {
            System.out.println("Even");}
        else {
            System.out.println("Odd");
        }
    }
}
