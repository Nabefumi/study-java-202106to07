package ca.bcit.winter2021.comp2522.midterm.question9;

public class ProductionInvoice extends Item{
    public ProductionInvoice(int price, int quantity, String department) {
        super(price, quantity, department);
    }

    @Override
    public int getTotalPrice() {
        return  (int)  ((this.price*this.quantity)+(this.quantity*10));
    }
}
