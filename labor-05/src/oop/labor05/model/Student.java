package oop.labor05.model;

public class Student {
    private String ID;
    private String firstName;
    private String lastName;

    public Student(String ID,String lastName,String firstName)
    {
        this.ID=ID;
        this.firstName=firstName;
        this.lastName=lastName;
    }

    public String getID() {
        return ID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "ID='" + ID + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}

