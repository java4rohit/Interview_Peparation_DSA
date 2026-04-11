package SOLID_Principles.OCP.src;

public class SyllabusApp {
    public static void main(String[] args) {

        SyllabusPrinter syllabusPrinter = new SyllabusPrinter();
        syllabusPrinter.print(new Java());

    }

}
