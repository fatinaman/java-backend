package module08;
public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Mahduf", "meranammahdufhain@gmail.com");


        customer.printInfo();
        customer.addPoints(50);
        customer.printInfo();


    Admin admin = new Admin("Mashrood", "meranammashroodhain@gmail.com","dba");

    admin.printInfo();
    admin.printRole();
    }
}
