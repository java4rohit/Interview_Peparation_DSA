package java8.Stream;

import java.util.Date;

public class Employee {

    private String name;
    private Double salary;
    private Date joiningDat;
    private String gender;

    public Employee(String name, Date joiningDat, String gender, Double salary) {
        this.gender = gender;
        this.joiningDat = joiningDat;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "gender='" + gender + '\'' +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", joiningDat=" + joiningDat +
                '}';
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getJoiningDat() {
        return joiningDat;
    }

    public void setJoiningDat(Date joiningDat) {
        this.joiningDat = joiningDat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}
