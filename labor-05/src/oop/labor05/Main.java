package oop.labor05;

import oop.labor02.MyDate;
import oop.labor05.model.Course;
import oop.labor05.model.Student;
import oop.labor05.model.Training;
import org.w3c.dom.css.CSSImportRule;

import javax.crypto.Cipher;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.nio.charset.CoderResult;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        ArrayList<Course> courses = readCourses("courses.csv");
        ArrayList<Student> students = readStudents("students.csv");
        ArrayList<Training> trainings=createTrainings(courses,students);
        /*for (Course course : courses) {
            System.out.println(course);
        }
        for (Student student : students) {
            System.out.println(student);
        }*/
        for (Training tr:trainings)
        {
            System.out.println(tr);
        }

    }

    private static ArrayList<Course> readCourses(String filename) {
        ArrayList<Course> courses = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File(filename))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] items = line.split(",");
                Course course = new Course(items[0].trim(), items[1].trim(), Integer.parseInt(items[2].trim()));
                courses.add(course);


            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return courses;
    }

    private static ArrayList<Student> readStudents(String filename) {
        ArrayList<Student>  students = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File(filename))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if(line.isEmpty())
                {
                    continue;
                }
                String[] items = line.split(",");
                students.add(new Student(items[0].trim(), items[1].trim(), items[2].trim()));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return students;
    }

    private static ArrayList<Training> createTrainings(ArrayList<Course> courses, ArrayList<Student> students) {
        Random random = new Random();
        ArrayList<Training> trainings = new ArrayList<>();
        for (int i = 0; i < courses.size(); i++) {
            Course course = courses.get(i);
            Training training = new Training(course, new MyDate(2023, 3, 21), new MyDate(2023, 3, 25), random.nextInt(2000 - 1000) + 1000);
            for (int j = 0; j < 10; j++) {
                int randomIndex = random.nextInt(students.size());
                Student student = students.get(randomIndex);
                training.enroll(student);
            }
            trainings.add(training); // Add the training object after enrolling students
        }
        return trainings;
    }

}

