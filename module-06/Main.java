class BankAccount {

    private long accountNumber;
    private String accountHolderName;
    private double balance;

    BankAccount(long accountNumber,
                String accountHolderName,
                double balance) {

        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;

        // i forgot to guard the constructor balance from negative balance at initialization
    }
    double getBalance() {
        return balance;
    }
    void printInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }

    void deposit(double amount){
        if (amount > 0){
            this.balance += amount;
            System.out.printf("Deposited: %.2f\n", amount);
            System.out.printf("Current balance: %.2f\n", this.balance);
        }else{
            System.out.println("Deposit amount must be positve.");
        }
    }

    void withdraw(double amount){
        if (amount > 0 && amount <=this.balance){
            this.balance -= amount;
            System.out.printf("Withdrew: %.2f\n", amount);
            System.out.printf("Current balance: %.2f\n", this.balance);
        }else if(amount <= 0){
            System.out.println("Cannot withdraw this amount.");
        }else if(amount > this.balance){
            System.out.println("Insufficient balance.");
        }else{
            System.out.println("Unknown error occured.");
        }
    }
}

public class Main{
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount(232323, "Shourav Choshun", 6678.797);
        BankAccount b2 = new BankAccount(232324, "Shourav Roshun", 6679.797);
        // b1.deposit(4500.56);
        // b2.deposit(456.65);
        // b1.withdraw(6000);
        // b1.printInfo();
        // b2.printInfo();
        // b1.balance += 80000;
        System.out.println(b1.getBalance());
    }
} 