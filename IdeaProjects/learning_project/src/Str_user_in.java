import java.util.Scanner;

public class Str_user_in {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = i.next();
        System.out.format("Thank you %s",name);
    }
}
