import java.util.*;

// Common payment interface
interface Payment {
    Object status();
    List<Object> getListOfPayment();
}

// Segregated Bank interface
interface Bank {
    void initiatePayment();
    void stopPayment();
}

// Segregated Loan interface
interface Loan {
    void initiateRepayment();
    void initiateFinalSettlement();
}

// BankPayment only depends on what it uses
class BankPayment implements Payment, Bank {

    @Override
    public void initiatePayment() {
        System.out.println("Initiating bank payment...");
    }

    @Override
    public void stopPayment() {
        System.out.println("Stopping bank payment...");
    }

    @Override
    public Object status() {
        return "Bank Payment Successful";
    }

    @Override
    public List<Object> getListOfPayment() {
        return Arrays.asList("Bank TXN001", "Bank TXN002");
    }
}

// LoanPayment only depends on what it uses
class LoanPayment implements Payment, Loan {

    @Override
    public void initiateRepayment() {
        System.out.println("Initiating loan repayment...");
    }

    @Override
    public void initiateFinalSettlement() {
        System.out.println("Initiating final loan settlement...");
    }

    @Override
    public Object status() {
        return "Loan Payment Pending";
    }

    @Override
    public List<Object> getListOfPayment() {
        return Arrays.asList("Loan TXN100", "Loan TXN200");
    }
}

// Main driver class
public class Day21hometask01 {
    public static void main(String[] args) {

        // Working with bank payment
        BankPayment bankPayment = new BankPayment();
        bankPayment.initiatePayment();
        System.out.println(bankPayment.status());
        System.out.println("Bank Payments: " + bankPayment.getListOfPayment());
        bankPayment.stopPayment();

        System.out.println();

        // Working with loan payment
        LoanPayment loanPayment = new LoanPayment();
        loanPayment.initiateRepayment();
        loanPayment.initiateFinalSettlement();
        System.out.println(loanPayment.status());
        System.out.println("Loan Payments: " + loanPayment.getListOfPayment());
    }
}

