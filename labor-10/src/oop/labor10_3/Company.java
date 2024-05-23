package oop.labor10_3;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Company {
    private String name;
    private List<Employee> employeeList=new ArrayList<>();
    public Company(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void hire(Employee employee) {
        employeeList.add(employee);
    }
    public void printAll(PrintStream stream) {
        for (Employee employee : employeeList) {
            stream.println(employee);
        }
    }
    public void printManager(PrintStream stream)
    {
        for (Employee employee : employeeList) {
            if (employee instanceof Manager) {
                stream.println(employee);
            }
        }
    }
    public int countTypes(){
        List<Class> classes=new ArrayList<>();
        for(Employee d:employeeList)
        {
            if(!classes.contains(d.getClass())) {
                classes.add(d.getClass());
            }

        }
        return classes.size();
    }
    public void sortByComparator(Comparator<Employee> employeeComparator)
    {
        Collections.sort(employeeList,employeeComparator);
    }
}
