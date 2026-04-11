package SOLID_Principles.OCP.src;

public class Mysql implements Course{


    public String getMYSQLCourseContent(){
        return  "Mysql introduction \n" +
                "Msql variable \n" +
                "Mysql syntax ";
    }
}
