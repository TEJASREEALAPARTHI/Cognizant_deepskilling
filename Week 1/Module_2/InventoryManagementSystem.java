import java.util.HashMap;

class Product {

    private int productId;
    private String productName;
    private int quantity;
    private double price;


    public Product(int productId, String productName,
                   int quantity, double price) {

        this.productId = productId;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }


    public int getProductId() {
        return productId;
    }


    public void setProductName(String productName) {
        this.productName = productName;
    }


    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    public void setPrice(double price) {
        this.price = price;
    }


    @Override
    public String toString() {

        return "Product ID: " + productId +
               ", Name: " + productName +
               ", Quantity: " + quantity +
               ", Price: ₹" + price;
    }
}



class InventoryManager {

    private HashMap<Integer, Product> inventory =
            new HashMap<>();


    // Add Product
    public void addProduct(Product product) {

        inventory.put(product.getProductId(), product);

        System.out.println("Product Added Successfully");
    }



    // Update Product
    public void updateProduct(int productId,
                              String name,
                              int quantity,
                              double price) {

        Product product = inventory.get(productId);


        if (product != null) {

            product.setProductName(name);
            product.setQuantity(quantity);
            product.setPrice(price);

            System.out.println("Product Updated Successfully");

        } else {

            System.out.println("Product Not Found");
        }
    }



    // Delete Product
    public void deleteProduct(int productId) {

        if (inventory.remove(productId) != null) {

            System.out.println("Product Deleted Successfully");

        } else {

            System.out.println("Product Not Found");
        }
    }



    // Display Products
    public void displayProducts() {

        if (inventory.isEmpty()) {

            System.out.println("Inventory is Empty");
            return;
        }


        for (Product product : inventory.values()) {

            System.out.println(product);
        }
    }
}



public class InventoryManagementSystem {


    public static void main(String[] args) {


        InventoryManager manager = new InventoryManager();



        Product p1 = new Product(
                101,
                "Mobile",
                50,
                25000
        );


        Product p2 = new Product(
                102,
                "Keyboard",
                100,
                1500
        );



        // Adding Products

        manager.addProduct(p1);
        manager.addProduct(p2);



        System.out.println("\nInventory:");

        manager.displayProducts();



        // Updating Product

        manager.updateProduct(
                101,
                "Smartphone",
                40,
                30000
        );



        System.out.println("\nAfter Update:");

        manager.displayProducts();



        // Deleting Product

        manager.deleteProduct(102);



        System.out.println("\nAfter Delete:");

        manager.displayProducts();

    }
}