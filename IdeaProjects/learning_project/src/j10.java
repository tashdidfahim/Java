import java.util.Scanner;
public class j10 {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        int x, y;
        System.out.print("Enter the value of x: ");
        x = i.nextInt();
        System.out.print("Enter the value of y: ");
        y = i.nextInt();
        if (x==y){
            System.out.println("Same");}
        else if(x<y){
            System.out.println("y is greater");}
        else {
            System.out.println("x is greater");
        }
    }
}
