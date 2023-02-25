import java.util.Scanner;
public class j7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the 1st number: ");
        int a = input.nextInt();
        System.out.print("Enter the 2nd number: ");
        int b = input.nextInt();
        a+=b;
        System.out.println(a);
    }
}