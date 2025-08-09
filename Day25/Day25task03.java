package com.example;

class BillingCounterService {
    public void payBill(String accountId, String billId, double amount) {
        System.out.println("Paying for Mangoes " + amount + " for billId " + billId + " from account " + accountId);
    }
}

class StoreStaffService {
    public void getItems(String items) {
        System.out.println("Selecting Mangoes");
    }
}

class MallFacade {
    private StoreStaffService storeStaffService;
    private BillingCounterService billingCounterService;

    public MallFacade() {
        this.storeStaffService = new StoreStaffService();
        this.billingCounterService = new BillingCounterService();
    }

    public void getItems(String items) {
        storeStaffService.getItems(items);
    }

    public void payBill(String accountId, String billId, double amount) {
        billingCounterService.payBill(accountId, billId, amount);
    }
}

public class Day25task03 {
    public static void main(String[] args) {
        System.out.println("Facade Method DP - Structural Design Pattern");

        MallFacade mallFacade = new MallFacade();

        mallFacade.getItems("Fruits");

        mallFacade.payBill("123", "billno 44", 500.0);
    }
}
