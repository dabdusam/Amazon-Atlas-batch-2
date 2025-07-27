import java.io.FileWriter;
import java.io.IOException;

public class Day20task03 {
    public static void main(String[] args) {
        CustomerSRP cobj = new CustomerSRP("Samad", "C002");
        ManagingFiles mobj = new ManagingFiles();
        mobj.saveData(cobj);
    }
}

// Renamed to avoid conflict
class CustomerSRP {
    private String name;
    private String custID;

    public CustomerSRP(String name, String custID) {
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

// Handles file saving
class ManagingFiles {
    public void saveData(CustomerSRP customer) {
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


