public class SavingsAccount extends BankAccount{


    SavingsAccount(String accountName, double balance) {
       super(accountName, balance);
    }

    @Override
    public void displaySummary(){
        System.out.println("Account Type: Savings Account");
        System.out.println("Account Name: " + getAccountName());
        System.out.println("Balance: " + getBalance());
    }
}
