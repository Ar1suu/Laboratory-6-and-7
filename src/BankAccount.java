public class BankAccount {
    private String accountName;
    private double balance;

    BankAccount(String accountName, double balance){
        this.accountName = accountName;
        this.balance = balance;
    }

    public String getAccountName(){
        return accountName;
    }

    public double getBalance(){
        return balance;
    }

    public void displaySummary(){
        System.out.println("This is a bank account");
    }


    public boolean deposit(double amount) {

        if (amount <= 0) {
            System.out.println("Invalid deposit amount.");
            return false;
        }

        balance += amount;
        System.out.println("New balance: " + getBalance());

        return true;
    }

    public boolean deposit(double amount, String source) {

        System.out.println("Source: " + source);

        return deposit(amount);
    }

    public boolean deposit(double amount, String source, String referenceNumber) {

        System.out.println("Source: " + source);
        System.out.println("Reference Number: " + referenceNumber);

        return deposit(amount);
    }

    public boolean withdraw(double amount) {

        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
            return false;
        }

        if (amount > balance) {
            System.out.println("Insufficient balance.");
            return false;
        }

        balance -= amount;
        System.out.println("New balance: " + getBalance());

        return true;
    }

}
