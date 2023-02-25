import java.util.Scanner;
public class PracticeSet3 {
    public static void main(String[] args) {
        //Problem1
        String name = "Tashdid Fahim";
        System.out.println("1. "+name.toLowerCase());

        //Problem2
        System.out.println("2. "+name.replace(" ","_"));

        //Problem3
        String letter = "\"Dear Fahim, Thanks a lot\".";
        System.out.println("4. "+letter.replace("Fahim","Abir"));

        //Problem4
        String a = "  Fahim  , anil   ,   ,akfl  ";
        System.out.println(a.indexOf("  ",3));
        System.out.println(a.indexOf("   "));

    }
}
