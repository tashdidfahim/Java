// Celcious to Fahrenheit
import java.util.Scanner;
public class j8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Fahrenheit: ");
        float F = input.nextFloat();
        float C = (float) 5/9 * (F - 92);
        System.out.println("The Celcious is: "+ C);
    }
}