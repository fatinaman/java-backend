class BankAccount {

    long accountNumber;
    String accountHolderName;
    double balance;

    BankAccount(long accountNumber,
                String accountHolderName,
                double balance) {

        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }
    
    void printInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }
}

public class Main{
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount(232323, "Shourav Choshun", 6678.797);
        BankAccount b2 = new BankAccount(232324, "Shourav Roshun", 6679.797);

        b1.printInfo();
        b2.printInfo();
    }
}