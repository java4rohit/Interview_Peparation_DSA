package java11;

/*
1.Java StringTestFeature.java--- its will run in java11
2.isBlank() method is introduce in java 11
3.lines();
4.repeat()
5.stripTrailing()

 */
public class StringTestFeature {

    public static void main(String[] args) {
        String str = "      Hello        World!   ";

        str= str.strip().replaceAll("\\\s+"," ");

        System.out.println(str);
    }
}
