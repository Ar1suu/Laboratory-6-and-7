public class DepositService implements BankingService {

    @Override
    public String getServiceName() {
        return "Deposit Service";
    }

    @Override
    public void process(BankAccount account, double amount) {

        if (account.deposit(amount)) {
            System.out.println("Deposit successful.");
        }
    }
}
