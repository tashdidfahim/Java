import java.util.Scanner;
public class j5 {
    public static void main(String[] args)
    {
        int a,b;
        Scanner d = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        a = d.nextInt();
        System.out.print("Enter 2nd number: ");
        b = d.nextInt();
        float c = (float) a / b;
        System.out.println("The sum is: "+c);
    }
}
