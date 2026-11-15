public class CheckingAccount extends BankAccount{

    CheckingAccount(String accountName, double balance) {
        super(accountName, balance);
    }

    @Override
    public void displaySummary(){
        System.out.println("Account Type: Checking Account");
        System.out.println("Account Name: " + getAccountName());
        System.out.println("Balance: " + getBalance());
    }
}
