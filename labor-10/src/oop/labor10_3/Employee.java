package oop.labor10_3;

import oop.labor10_2.MyDate;

public class Employee {
    private int ID;
    private String firstName;
    private String lastName;
    private int salary;
    private MyDate birthDate;
    private static int counter;
    public Employee(String firstName, String lastName, int salary, MyDate birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.birthDate = birthDate;
        this.ID = counter++;
    }
    public int getID() {
        return ID;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public double getSalary() {
        return salary;
    }
    public MyDate getBirthDate() {
        return birthDate;
    }

    @Override
    public String toString() {
        return " " +
                "ID=" + ID +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                ", birthDate=" + birthDate +

                '}';
    }
}
