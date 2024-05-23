package oop.labor10;

public class Main {
    public static void main(String[] args) {
        SortingDemo p1=new SortingDemo("fruits.txt");
        p1.printFruits();
        p1.sortAlphabetically();
        p1.printFruits();
        p1.sortReverseAlphabetically();
        p1.printFruits();
    }
}
