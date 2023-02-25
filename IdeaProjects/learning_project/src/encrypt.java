public class encrypt {
    public static void main(String[] args) {
        char grade = 'B';
        grade = (char)(grade+8);
        System.out.println("Encrypted grade: "+grade);
        //decrypt
        grade = (char)(grade-8);
        System.out.println("Decrypted grade: "+grade);
    }
}
