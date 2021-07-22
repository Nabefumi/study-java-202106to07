package ca.bcit.winter2021.comp2522.midterm.question9;

public class EngineeringInvoice extends Item{
    public EngineeringInvoice(int price, int quantity, String department) {
        super(price, quantity, department);
    }
    @Override
    public int getTotalPrice() {
        return (int) ((this.price * super.quantity) + (this.price * this.quantity) * 0.5);
    }
}
