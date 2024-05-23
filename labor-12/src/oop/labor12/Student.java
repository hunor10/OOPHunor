package oop.labor12;

import java.util.HashMap;
import java.util.Map;

public class Student {
    private int id;
    private String firstName;
    private String lastName;
    private Map<String, Double> marks=new HashMap<>();
    private double average;
    public Student(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getAverage() {
        return average;
    }
    public void addMark(String subject,Double grade)
    {
        marks.put(subject, grade);
    }
    public double calculateAverage()
    {
    //
        return 1;
    }
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", marks=" + marks +
                ", average=" + average +
                '}';
    }
}
