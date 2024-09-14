package JavaConcept.String;

public class Test {

    public static void main(String[] args) {

        String s1 = "Rohit";
        String s2 = "Rohit";
        System.out.println(s1==s2);
        System.out.println("s1.equals(s2)"+s1.equals(s2));
        s2 = "Rahul";
        System.out.println(s1==s2);
        System.out.println("s1.equals(s2)"+s1.equals(s2));

        String s3 = new String("Rohit");
        System.out.println(s1==s3);
        System.out.println("s1.equals(s3)"+s1.equals(s3));
        String s4 = new String("Rohit");

        System.out.println("s4.equals(s3)"+s4.equals(s3));

        System.out.println("s4.equals(s3)"+s4.equals(s3));


        System.out.println(s4==s3);
    }
}
