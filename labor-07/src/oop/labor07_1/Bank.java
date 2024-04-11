package oop.labor07_1;



import java.io.PrintStream;
import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Customer> customers=new ArrayList<>();

    public Bank(String bank)
    {
        this.name=bank;
    }
    public Customer getCustomer(int customer)
    {
        return customers.get(customer);
    }
    public void addCustomer(Customer customer)
    {
        customers.add(customer);
    }
    public int numCustomers()
    {
        return customers.size();
    }
    private void printCustomers( PrintStream ps ) {
        ps.println("ID, Firstname, Last name, Number of bank accounts");
        for (Customer customer : customers) {
            ps.println(customer.getId() + ", " + customer.getFirstName() + ", " +
                    customer.getLastName() + ", " + customer.getNumAccounts());
        }
        ps.close();
    }
    public void printCustomersToStdout() {
        printCustomers( System.out );
    }
    public void printCustomersToFile( String filename ) {
        try {
            printCustomers( new PrintStream(filename ));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
