package oop.labor05.model;
import oop.labor02.MyDate;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;

public class Training {
    private Course course;
    private MyDate startDate;
    private MyDate endDate;
    private double pricePerStudent;
    private ArrayList<Student> enrolledStudents=new ArrayList<>();
    public Training (Course course, MyDate startDate, MyDate endDate,double pricePerStudent)
    {
        this.course=course;
        this.startDate=startDate;
        this.endDate=endDate;
        this.pricePerStudent=pricePerStudent;

    }
    public boolean enroll(Student student)
    {
        for(Student enrolled:enrolledStudents)
        {
            if(enrolled.equals(student)) return false;
        }
        enrolledStudents.add(student);
    return true;
    }
    public Student findStudentByID(String ID)
    {
     for(Student enrolled:enrolledStudents)
     {
         if(enrolled.getID().equals(ID))
         {
             return enrolled;
         }
     }
     return null;
    }
    public Course getCourse()
    {
        return course;
    }
    public int numEnrolled()
    {

        return this.enrolledStudents.size();
    }
    public void PrintToFile()
    {
        try(PrintStream ps = new PrintStream("persons.csv")) {
            ps.println();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

     public String toString() {
        StringBuffer S=new StringBuffer("The course:" + course +" is between"+startDate+"-"+endDate+" the price is "+pricePerStudent);
    for(Student s:enrolledStudents)
    {
        S.append(s.toString());
    }
    return S.toString();
    }

    public void unEnroll(String ID)
    {
        for(Student enrolled:enrolledStudents)
        {
            if(enrolled.getID().equals(ID)) {
                enrolledStudents.remove(enrolled);
                break;
            }
        }
    }

}
