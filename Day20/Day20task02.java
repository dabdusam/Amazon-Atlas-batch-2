import java.io.FileWriter;
import java.io.IOException;

// Main class
public class Day20task02 {
    public static void main(String[] args) {
        Customer cobj = new Customer("Samad", "C002");
        CustomerDataSaver saver = new CustomerDataSaver();
        saver.saveData(cobj);
    }
}

// Class 1: Customer — only holds data
class Customer {
    private String name;
    private String custID;

    public Customer(String name, String custID) {
        this.name = name;
        this.custID = custID;
    }

    public String getName() {
        return name;
    }

    public String getCustID() {
        return custID;
    }
}

// Class 2: CustomerDataSaver — handles saving customer data
class CustomerDataSaver {
    public void saveData(Customer customer) {
        try {
            FileWriter fw = new FileWriter(customer.getName().trim() + ".txt");
            fw.write("The customer name is " + customer.getName() + "\t");
            fw.write("The customer ID is " + customer.getCustID() + "\t");
            fw.close();
            System.out.println("The data is saved in the file with your name.");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}

