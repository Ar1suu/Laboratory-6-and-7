public class InterestService implements BankingService{

    @Override
    public String getServiceName() {
        return "Interest Service";
    }

    @Override
    public void process(BankAccount account, double amount) {

        double interest = account.getBalance() * 0.02;

        account.deposit(interest);

        System.out.println("Interest added: " + interest);
    }
}
