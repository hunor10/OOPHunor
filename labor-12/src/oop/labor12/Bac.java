package oop.labor12;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Bac {
    private Map<Integer,Student> students=new HashMap<>();
    public long i;
    public Bac(String filename)
    {
        try(Scanner scanner=new Scanner(new File(filename))) {
        while(scanner.hasNextLine()) {
            String line=scanner.nextLine();
            String[] items=line.split(" ");
            students.put(Integer.parseInt(items[0]),new Student(Integer.parseInt(items[0].trim()),items[1].trim(),items[2].trim()));
        }
            //System.out.println(students);
        }catch(FileNotFoundException e){e.printStackTrace();}
    }
    public void readSubject(String subject)
    {
        try(Scanner scanner=new Scanner(new File(subject))) {
            while(scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] items = line.split(" ");
                double grade = Double.parseDouble(items[1].trim());
                Student student=students.get(Integer.parseInt(items[0].trim()));
                if(student==null)
                {
                    System.out.println("ID DOESNT EXITS:"+Integer.parseInt(items[0].trim()));
                    continue;
                }
                else i++;
                student.addMark(subject,grade);//ez pointol a students elemere s megis valtoztatja
            }
            System.out.println(students);
        }catch(FileNotFoundException e){e.printStackTrace();}
    }

    public long getI() {
        return i;
    }
}
