package module13;

import java.util.ArrayList;
import java.util.List;

public class ProductStore {
    private List<Product> productList = new ArrayList<>();
    public Product getProductById(long id){
        for(Product p : this.productList){
            if(p.getId() == id){
                return p;
            }
        }
        return null;
    }

    public void showAllProducts(){
        for(Product p : this.productList){
            p.printInfo();
        }
    }

    public int productCount(){
        return this.productList.size();
    }

    public void addProduct(Product product){
        this.productList.add(product);
    }

    public void removeProduct(Product product){
        this.productList.remove(product);
    }
    public static void main(String[] args) {
        ProductStore store = new ProductStore();
        Product p1 = new Product(23, "Computer", 899.99);
        Product p2 = new Product(45,"Mobile Phone", 399.99);
        Product p3 = new Product(47,"Camera", 299.99);
        store.addProduct(p1);
        store.addProduct(p2);
        store.addProduct(p3);

        System.out.printf("Available products: %d%n", store.productCount());
        
        store.showAllProducts();

        Product foundProduct = store.getProductById(23);
        if(foundProduct != null){
            foundProduct.printInfo();
        }else{
            System.out.println("No product by that id");
        }

        store.removeProduct(p3);
        System.out.printf("Available products: %d%n", store.productCount());
        store.showAllProducts();
    }
}
