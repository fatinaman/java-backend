package module14;
import java.util.HashMap;
import java.util.Map;

import module13.Product;

public class ProductMapStore {
    private Map<Long,Product> products = new HashMap<>();

    public void addProduct(long key,Product product){
        this.products.put(key,product);
    }

    public Product getProduct(long id){
        return this.products.get(id);
    }

    public void removeProduct(long id){
        this.products.remove(id);
    }

    public int productCount(){
        return this.products.size();
    }

    public boolean containsProduct(long id) {
        return this.products.containsKey(id);
    }

    public void showAllProducts(){
        for(long key : this.products.keySet()){
            System.out.printf("Product ID: %d, Product Name: %s%nPrice: %.2f%n",
            key, this.products.get(key).getName(), this.products.get(key).getPrice());
        }
    }

    public static void main(String[] args) {
        ProductMapStore store = new ProductMapStore();
        store.addProduct(343, new Product(343, "Optimus Prime", 453.99));
        store.addProduct(101, new Product(101, "Megatron", 499.99));
        store.addProduct(102, new Product(102, "Bumblebee", 299.50));
        store.addProduct(103, new Product(103, "Starscream", 349.99));
        store.addProduct(104, new Product(104, "Soundwave", 399.00));
        store.addProduct(105, new Product(105, "Grimlock", 420.75));

        // i COULD REMOVE THE REDUNDANT KEY AND ID HERE by handling it
        // but I chose not to for saving time

        System.out.println("Total products: " + store.productCount());
        System.out.println("Contains ID 101? " + store.containsProduct(101)); // Expected: true
        System.out.println("Contains ID 999? " + store.containsProduct(999)); // Expected: false
        Product retrieved = store.getProduct(343);
        if (retrieved != null) {
            System.out.println("Retrieved Successfully");
        } else {
            System.out.println("Product not found.");
        }
        store.removeProduct(101);
        System.out.println("Removed product 101. New count: " + store.productCount()); // Expected: 2
        System.out.println("Contains ID 101 now? " + store.containsProduct(101));
        store.showAllProducts();
    }
}
