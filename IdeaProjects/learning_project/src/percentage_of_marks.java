import java.util.Scanner;
public class percentage_of_marks {
    public static void main(String[] args) {
        int roll,ik;
        byte opf,bme,power,gear,dsp;
        Scanner i = new Scanner(System.in);
        System.out.println("Dept of EEE \n4th year 1st Semester\n");
        System.out.print("Enter your roll: ");
        roll = i.nextInt();
        System.out.print("Enter the marks of Optical fiber Communication: ");
        opf = i.nextByte();
        /*System.out.print("Enter the marks of Biomedical Engineering: ");
        bme = i.nextByte();
        System.out.print("Enter the marks of Power Plant Engineering: ");
        power = i.nextByte();
        System.out.print("Enter the marks of Switch Gear: ");
        gear = i.nextByte();
        System.out.print("Enter the marks of Digital Signal Processing: ");
        dsp = i.nextByte();*/
        ik = (opf/72)*100;
        System.out.println("The percentage of opf is: "+ ik);
    }
}
