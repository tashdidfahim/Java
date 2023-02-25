public class str_14 {
    public static void main(String[] args) {
        String a,i;
        a = "Tashdid Fahim";
        i = a.substring(2,10);
        System.out.println(i);
        System.out.println(a.replace('d','T'));
        System.out.println(a.replace("Fahim","Anwar"));
        System.out.println(a.startsWith("Fa"));
        System.out.println(a.endsWith("m"));
        System.out.println(a.charAt(4));
        System.out.println(a.indexOf("i",8));
        System.out.println(a.lastIndexOf("i",5));
        System.out.println(a.equals("Fahim"));
        //System.out.println(a.substring(2,9));
    }
}
