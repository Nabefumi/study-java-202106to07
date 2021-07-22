package ca.bcit.winter2021.comp2522.midterm.question9;

public class InventoryInvoice extends Item {
    public InventoryInvoice(int price, int quantity, String department) {
        super(price, quantity, department);
    }
    @Override
    public int getTotalPrice() {
        return (this.price * this.quantity) + 100;
    }
}
