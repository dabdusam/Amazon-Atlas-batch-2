package com.example;

import java.util.Objects;

// Real Subject
class DataBase {
    void execute(String query, String desig) {
        System.out.println("Query execution is in process: " + query + " by " + desig);
    }
}

// Subject interface
interface DatabaseExecute {
    void executeQuery(String type);
}

// Proxy
class ProxyDataBase implements DatabaseExecute {
    private String desig;
    private DataBase db;

    public ProxyDataBase(String desig) {
        this.desig = desig;
        db = new DataBase();
    }

    @Override
    public void executeQuery(String type) {
        if (type.equalsIgnoreCase("Delete") && (!Objects.equals(this.desig, "ADMIN"))) {
            System.out.println(this.desig + ": You don't have permission to delete.");
            return;
        }
        db.execute(type, this.desig);
    }
}

// Client
public class Day25task04 {
    public static void main(String[] args) {
        System.out.println("Proxy Method Design Pattern - Structural Design Pattern");

        DatabaseExecute emp1 = new ProxyDataBase("ADMIN");
        emp1.executeQuery("Delete");
        emp1.executeQuery("Write");
        emp1.executeQuery("Read");

        System.out.println();

        DatabaseExecute emp2 = new ProxyDataBase("HR");
        emp2.executeQuery("Delete");
        emp2.executeQuery("Write");
        emp2.executeQuery("Read");

        System.out.println();

        DatabaseExecute emp3 = new ProxyDataBase("EMPLOYEE");
        emp3.executeQuery("Delete");
        emp3.executeQuery("Write");
        emp3.executeQuery("Read");
    }
}

