import java.util.Scanner;
public class switch_case {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int age;
        System.out.print("Enter your age: ");
        age = in.nextInt();
        switch (age) {
            case 18:
                System.out.println("Adult");
                break;
            case 25:
                System.out.println("job");
                break;
            case 60:
                System.out.println("Old");
                break;
            default:
                System.out.println("Robot");
                break;
        }
        System.out.println("End");
    }
}
