package oop.labor04_1;

public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;
    public Person(String firstName,String lastName,int birthYear)
    {
     this.firstName=firstName;
     this.lastName=lastName;
     this.birthYear=birthYear;
    }
    public String getFirstName()
    {
        return this.firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthYear=" + birthYear +
                '}';
    }
}

