package SOLID_Principles.OCP.src;

public class SpringBoot implements Course{
    public String getSpringBootCourseContent(){
        return  "Spring introduction \n" +
                "Spring MBC \n" +
                "Spring DI  \n" +
                "Spring IOC ";
    }
}
