import java.util.Scanner;

public class cgpa_calculator {
    public static void main(String[] args) {
        byte ban,eng,math,phy,chem;
        Scanner i = new Scanner(System.in);
        System.out.print("Enter the marks of Optical fiber Communication: ");
        ban = i.nextByte();
        System.out.print("Enter the marks of Biomedical Engineering: ");
        eng = i.nextByte();
        System.out.print("Enter the marks of Power Plant Engineering: ");
        math = i.nextByte();
        System.out.print("Enter the marks of Switch Gear: ");
        phy = i.nextByte();
        System.out.print("Enter the marks of Digital Signal Processing: ");
        chem = i.nextByte();
        int result = (ban+eng+math+phy+chem)*100/500;
        System.out.println("The percentage of opf is: "+result+"%");
    }
}
