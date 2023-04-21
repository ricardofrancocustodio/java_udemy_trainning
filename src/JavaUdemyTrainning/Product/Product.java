package JavaUdemyTrainning.Product;

public class Product {

    private String name;
    private double price;
    private int quantity;

    public Product(){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double totalValueInStock(double price, int quantity){
        return price * quantity;
    }

    public int addProducts(int quantity, int addQuantity){
        return quantity + addQuantity;
    }

    public int removeProducts(int quantity, int removeQuantity) {
        return (quantity < removeQuantity) ? quantity : quantity - removeQuantity;

    }

    public String getName(){ return name; }

    public int getQuantity(){ return quantity; }

    public double getPrice(){ return price; }

    public String toString(){
        return "Product data: " + name + ", Price: " + price + ", " + quantity + " units, " + "Total: $" + totalValueInStock(price, quantity);
    }


}
