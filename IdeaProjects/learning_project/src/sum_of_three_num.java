import java.util.Scanner;

public class sum_of_three_num {
    public static void main(String[] args) {
        int num1, num2, num3, sum;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of 1st number: ");
        num1 = in.nextInt();
        System.out.print("Enter the value of 2nd number: ");
        num2 = in.nextInt();
        System.out.print("Enter the value of 3rd number: ");
        num3 = in.nextInt();
        sum = num1 + num2 + num3;
        System.out.println("The sum of three number is "+sum);
    }
}
