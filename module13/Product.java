package module13;

public class Product {
    private long id;
    private String name;
    private double price;
    private int stock;

    public Product(long id, String name, double price, int stock){
        this.id = id;
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public Product(long id, String name, double price){
        this(id, name, price, 0);
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return this.name;
    }

    public void setNewName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return this.price;
    }

    public void setNewPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return this.stock;
    }

    public void restock(int restockValue){
        if(restockValue>0){
            this.stock += restockValue;
        }
    }

    public void sellStock(int sellStockValue){
        if(sellStockValue > 0 && sellStockValue <= this.stock){
            this.stock -= sellStockValue;
        }else{
            System.out.println("Couldnt sell stock");
        }
    }
    
    public void printInfo(){
        System.out.printf("Name : %s%nId : %d%nPrice : %.2f%nRemaining Stock : %d%n"
            ,this.name, this.id, this.price, this.stock
        );
    }


}