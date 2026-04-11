package SOLID_Principles.OCP.test;

import SOLID_Principles.OCP.src.*;

public class SyllabusPrinterTest {

    public  void test_printer(){
        new SyllabusPrinter().print(new Mysql());
        new SyllabusPrinter().print(new Java());
        new SyllabusPrinter().print(new Microservices());
        new SyllabusPrinter().print(new SpringBoot());
        new SyllabusPrinter().print(new C());
    }

    public static void main(String[] args) {
        new SyllabusPrinterTest().test_printer();
    }


}
