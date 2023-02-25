import java.util.Scanner;

public class kilo_to_mile {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double kilo,mile;
        System.out.print("Enter value of kilo: ");
        kilo = in.nextInt();
        mile = 0.62137 * kilo;
        System.out.println("The mile is = "+ mile);
    }
}
