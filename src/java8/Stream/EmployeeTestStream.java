package java8.Stream;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeTestStream {

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date joiningDateRam = dateFormat.parse("01-01-2000");
        Date joiningDateSita = dateFormat.parse("15-05-1995");
        Date joiningDateVishnu = dateFormat.parse("10-12-1998");
        Date joiningDateMahesh = dateFormat.parse("20-03-1990");

        List<Employee> employeeList = Arrays.asList(
                new Employee("Ram Yadav",joiningDateRam ,"Male",20000.0),
                new Employee("Sita Singh",joiningDateSita,"Female",30000.0 ),
                new Employee("Vishnu Jha",joiningDateVishnu,"Male",40000.0),
                new Employee("Mahesh",joiningDateMahesh,"Male",50000.0)

        );

        double largest = Integer.MIN_VALUE;
        double secound = Integer.MIN_VALUE;
        for (Employee e : employeeList){
            if(largest<e.getSalary()){
                largest=e.getSalary();
            }
        }

        System.out.println(largest);

        Employee employee1 = employeeList.stream().max((o1, o2) -> (int) (-o1.getSalary() - o1.getSalary())).get();

        System.out.println(employee1);

       //Secound Height Salary  -----------------
        Employee employee = employeeList.stream().sorted(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return (int) (-o1.getSalary() - o2.getSalary());
            }
        }).collect(Collectors.toList()).get(1);

        System.out.println(employee);




        //Name of employee  who is the most senior ---------->

        Employee seniorEmployee = employeeList.stream().sorted(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return  (o1.getJoiningDat().compareTo(o2.getJoiningDat()));
            }
        }).collect(Collectors.toList()).get(1);


        System.out.println(seniorEmployee);

        //Count the Employee Based On Gender -------------------->


        Map<String, Long> collect = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));

        System.out.println(collect);
    }
}
