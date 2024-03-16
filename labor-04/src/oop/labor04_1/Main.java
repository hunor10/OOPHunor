package oop.labor04_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        readFilePrintItsLineNumbered("input.txt");
        ArrayList<Person> persons=readFromCSVFile("input.csv");
        //System.out.println(persons);
        for(Person person:persons)
        {
            System.out.println(person);
        }
    }

    public static void readFilePrintItsLineNumbered(String fileName)
    {
        try(Scanner scanner = new Scanner( new File(fileName))){
            int linenum=0;
            while(scanner.hasNextLine())
            {
                String line=scanner.nextLine();
                linenum++;
                System.out.println(linenum+" "+line);
            }
        } catch(FileNotFoundException e){
            e.printStackTrace();
        }
    }
    public static ArrayList<Person> readFromCSVFile(String filename) {
        ArrayList<Person> persons=new ArrayList<>();
        try(Scanner scanner = new Scanner(new File(filename))){
            while(scanner.hasNextLine())
            {
                String line=scanner.nextLine();
                if(line.isEmpty())
                {
                    continue;
                }
                String[] items=line.split(",");
                // System.out.println(items[0]);
                String firstName=items[0].trim();
                String lastName=items[1].trim(); //persons.get(0); persons.set(0,"JOHN"); persons.remove(0);persons.clear(),.size() stb..;
                int birthYear=Integer.parseInt(items[2].trim());
                persons.add(new Person(firstName,lastName,birthYear));
            }
        }catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }

        return persons;
    }
}

