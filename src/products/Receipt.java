package products;

public class Receipt extends Product{
    public Receipt(String name, double price) {
        super(name, price);
    }
    public String toString(){
        return this.name+"  "+this.price+"  ";
    }
}
