package oop.labor10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class SortingDemo {
    private List<String> fruits = new ArrayList<>();
    public SortingDemo(String filename) {
    try(Scanner sc = new Scanner(new File(filename))) {
        while(sc.hasNextLine()) {
            fruits.add(sc.nextLine());
        }
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    }

    }
    public void printFruits() {
//        fruits.forEach(System.out::println);
        System.out.println(fruits);
    }
    public void sortAlphabetically()
    {
        Collections.sort(fruits); //novekvo sorrendbe
    }
    public void sortReverseAlphabetically()
    {
        Collections.sort(fruits, Collections.reverseOrder());//csokkeno sorrendbe abc
    }
}
