package myhomeworkpackage;/*Create a class called "Product" with properties "productId", "productName", "price", and "quantity".
Implement methods to set and get the values of these properties.
Also, implement a method to calculate the total price of the product based on the quantity.
Finally, implement a method to display the details of the product.
 */

public class GptProduct {
    int productId;
    String productName;
    double price;
    int quantity;


    //Constructor
    public GptProduct(int productId, String productName, double price, int quantity) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    //Methods to set
    public void setProductId() {
        this.productId = productId;
    }

    public void setProductName() {
        this.productName = productName;
    }

    public void setPrice() {
        this.price = price;
    }

    public void setQuantity() {
        this.quantity = quantity;
    }

    //Methods get
    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    //Methods details
    public void detailsProduct() {
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Product Price: " + price);
        System.out.println("Product Quantity: " + quantity);

    }

    public double totalPrice(){
        return price * quantity;
    }

    public static void main(String[] args) {
        GptProduct product = new GptProduct(1, "Lime", 2, 120);
        System.out.println(product.totalPrice());
        product.detailsProduct();
    }
}
