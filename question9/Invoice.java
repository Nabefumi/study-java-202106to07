package ca.bcit.winter2021.comp2522.midterm.question9;

import java.util.ArrayList;

public class Invoice {
    ArrayList<Item> engineeringInvoice;
    ArrayList<Item> productInvoice;
    ArrayList<Item> inventoryInvoice;

    public Invoice(ArrayList<Item> engineeringInvoice, ArrayList<Item> productInvoice, ArrayList<Item> inventoryInvoice){
        this.engineeringInvoice = engineeringInvoice;
        this.productInvoice = productInvoice;
        this.inventoryInvoice = inventoryInvoice;
    }

    double calculateTotalInvoicePrice(){
        double totalPrice = 0;
        totalPrice = totalPrice + engineeringInvoice.stream().mapToInt(w -> w.getTotalPrice()).sum();
        totalPrice = totalPrice + productInvoice.stream().mapToInt(w -> w.getTotalPrice()).sum();
        totalPrice = totalPrice + inventoryInvoice.stream().mapToInt(w -> w.getTotalPrice()).sum();
        return totalPrice;
    }
}
