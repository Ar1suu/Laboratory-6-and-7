public class WithdrawalService implements BankingService{

    @Override
    public String getServiceName() {
        return "Withdraw Service";
    }

    @Override
    public void process(BankAccount account, double amount) {

        if (account.withdraw(amount)) {
            System.out.println("Withdrawal successful.");
        }
    }
}
