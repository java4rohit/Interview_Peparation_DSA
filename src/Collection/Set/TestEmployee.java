package Collection.Set;

import java.util.HashSet;
import java.util.Set;

public class TestEmployee {

    public static void main(String[] args) {

        Set<Employee>  employeeSet = new HashSet<>();

        Employee employee1 = new Employee("1", "Rohit", "SDE");
        Employee employee2 = new Employee("2", "Rahul", "QA");
        Employee employee3 = new Employee("3", "Suresh", "Support");
        Employee employee4 = new Employee("1", "Rohit", "SDE");


        employeeSet.add(employee1);
        employeeSet.add(employee2);
        employeeSet.add(employee3);
        employeeSet.add(employee4);

        for (Employee employee :employeeSet){
            System.out.println(employee);
        }

    }
}
