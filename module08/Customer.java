package module08;

public class Customer extends User{
    private int loyaltyPoints = 0;
    public Customer(String name, String email){
        super(name,email);
    }
    public int getLoyaltyPoints() {
        return loyaltyPoints;
    }
    public void addPoints(int pointsToBeAdded){
        if(pointsToBeAdded>0){
            this.loyaltyPoints += pointsToBeAdded;
        }
    }
    @Override
    public void printInfo(){
        super.printInfo();
        System.out.printf("Loyalty Points : %d%n", 
        this.loyaltyPoints);
    }
}