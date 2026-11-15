public class BusinessAccount extends BankAccount{

    BusinessAccount(String accountName, double balance) {
        super(accountName, balance);
    }
    @Override
    public void displaySummary(){
        System.out.println("Account Type: Business Account");
        System.out.println("Account Name: " + getAccountName());
        System.out.println("Balance: " + getBalance());
    }
}
