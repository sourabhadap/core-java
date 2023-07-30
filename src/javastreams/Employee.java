package src.javastreams;

import java.io.Serializable;

public class Employee implements Serializable {
    String name;
    int age;
    double salary;
    String designation;
    transient int ssn;

    public Employee(String name, int age, double salary, String designation, int ssn) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.designation = designation;
        this.ssn = ssn;
    }
}
