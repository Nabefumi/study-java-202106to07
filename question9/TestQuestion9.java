package ca.bcit.winter2021.comp2522.midterm.question9;

import java.util.ArrayList;

public class TestQuestion9 {
    public static void runAllTestScenariosForQuestion9() {
        Item engineering1 = new EngineeringInvoice(100, 1,"Engineering");
        Item engineering2 = new EngineeringInvoice(200, 2,"Engineering");
        Item engineering3 = new EngineeringInvoice(300, 3,"Engineering");

        Item inventory1 = new InventoryInvoice(100,1,"Inventory");
        Item inventory2 = new InventoryInvoice(200,2,"Inventory");
        Item inventory3 = new InventoryInvoice(300,3,"Inventory");

        Item production1 = new ProductionInvoice(100,1,"Production");
        Item production2 = new ProductionInvoice(200,2,"Production");
        Item production3 = new ProductionInvoice(300,3,"Production");

        ArrayList<Item> engineeringInvoices= new ArrayList<>();
        engineeringInvoices.add(engineering1);
        engineeringInvoices.add(engineering2);
        engineeringInvoices.add(engineering3);

        ArrayList<Item> inventoryInvoices = new ArrayList<>();
        inventoryInvoices.add(inventory1);
        inventoryInvoices.add(inventory2);
        inventoryInvoices.add(inventory3);

        ArrayList<Item> productionInvoices = new ArrayList<>();
        productionInvoices.add(production1);
        productionInvoices.add(production2);
        productionInvoices.add(production3);

        Invoice invoice = new Invoice(engineeringInvoices,productionInvoices,inventoryInvoices);
        double totalPrice = invoice.calculateTotalInvoicePrice();
        System.out.println("Total price: "+ totalPrice);
    }
}
