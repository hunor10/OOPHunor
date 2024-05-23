package oop.labor10_3;

import oop.labor10_2.MyDate;

import java.util.Comparator;


public class Main {
    public static void main(String[] args) {
        Company company = new Company("Sapientia");
        company.hire(new Manager("Hadnagy", "Abigel", 1000, new MyDate(2004, 4, 9), "HR"));
        company.hire(new Manager("Kakucs", "Attila", 900, new MyDate(2006, 5, 15), "Mobile"));
        company.hire(new Employee("Hadnagy", "Lorant", 700, new MyDate(2006, 5, 4)));
        company.hire(new Employee("Csizmadia", "Laci", 800, new MyDate(2004, 5, 4)));
        System.out.println("Eredeti sorrend: ");
        company.printAll(System.out);
        System.out.println();
        System.out.println("ABC sorrend: ");
        System.out.println();
        company.sortByComparator(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                if (o1.getLastName().equals(o2.getLastName())) {
                    return o1.getFirstName().compareTo(o2.getFirstName());
                }
                return o1.getLastName().compareTo(o2.getLastName());
            }
        });

        company.printAll(System.out);

        System.out.println("Fizetes szerint csokkeno: ");System.out.println();
        company.sortByComparator((o1, o2) -> Double.compare(o2.getSalary(), o1.getSalary()) //return (int) (o2.getSalary()-o1.getSalary());

        );
        company.printAll(System.out);
    }
}
