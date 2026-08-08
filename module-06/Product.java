public class Product {
    private long id;
    private String name;
    private double price;
    private int stock;
    private static int productCount = 0;

    Product(long id, String name, double price, int stock){
        this.id = id;
        this.name = name;
        this.price = price;
        this.stock = stock;
        productCount++;
    }

    Product(long id, String name, double price){
        this(id,name,price,0);
    }

    void updatePrice(double price){
        double oldPrice = this.price;
        if(price>0){
            this.price = price;
            System.out.printf("Price updated to %.2f from %.2f", oldPrice, price);
        }else{
            System.out.println("Cannot update to the given price");
        }
    }

    double getPrice(){
        return this.price;
    }

    public String getNameById(long id){
        if(this.id == id){
            return this.name;
        }
        return "Error";
    }

    public void updateName(String name){
        if(this.name.equals(name)){
            System.out.println("This is the same name.");
        }else if(name.length()==0){
            System.out.println("cannot set name as empty.");
        }else{
            this.name = name;
        }
    }

    public void sell(int quantity){
        if(this.stock > quantity && quantity >0){
            this.stock -= quantity;
            System.out.printf("Sold %d of this product", quantity);
            System.out.printf("Remaining stock : %d", this.stock);
        }else if(this.stock == quantity){
            this.stock -=quantity; //this.stock = 0
            System.out.printf("Sold %d of this product", quantity);
            System.out.println("This item is now out of stock");
        }else{
            System.out.printf("Sorry, only %d of this product is available", this.stock);
        }
    }

    public void restock(int quantity){
        if(quantity > 0){
            this.stock +=  quantity;
            System.out.printf("Restocked : %d of this item", quantity);
            System.out.printf("New Stock : %d", this.stock);
        }else{
            System.out.println("Invalid amount to restock.");
        }
    }

    public static int getProductCount(){
        return productCount;
    }
}
