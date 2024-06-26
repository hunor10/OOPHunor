package oop.labor10_3;

import oop.labor10_2.MyDate;

public class Manager extends Employee{
    private String department;

    public Manager(String firstName, String lastName, int salary, MyDate birthDate,String department) {
        super(firstName, lastName, salary, birthDate);
        this.department=department;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    @Override
    public String toString() {
        return "Manager{" +
                "department='" + department + '\'' + super.toString()+
                '}';
    }
}
