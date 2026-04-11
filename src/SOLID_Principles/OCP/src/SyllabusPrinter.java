package SOLID_Principles.OCP.src;

public class SyllabusPrinter {

    public void print(Course course) {
        if (course instanceof Mysql) {
            System.out.println(((Mysql) course).getMYSQLCourseContent());
        }
        if (course instanceof Microservices) {
            System.out.println(((Microservices) course).getMicroservicesCourseContent());
        }
        if (course instanceof Java) {
            System.out.println(((Java) course).getJavaCourseContent());
        }
         if (course instanceof SpringBoot) {
            System.out.println(((SpringBoot) course).getSpringBootCourseContent());
        }
        if (course instanceof C) {
            System.out.println(((C) course).getCcourseContent());
        }
    }
}
