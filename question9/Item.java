package ca.bcit.winter2021.comp2522.midterm.question9;

public abstract class Item {
    protected int price;
    protected int quantity;
    protected String department;

    public Item(int price, int quantity, String department) {
        this.price = price;
        this.quantity = quantity;

    }
    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public abstract int getTotalPrice();
    //    public int getTotalPrice() {
//        if (department == "engineering") {
//            return (int) ((this.price * this.quantity) + (this.price * this.quantity) * 0.5);
//        } else if (department == "product") {
//            return (this.price * this.quantity) + 100;
//        } else {  //inventory
//            return (int)((this.price*this.quantity)+(this.quantity*10));
//        }
}
