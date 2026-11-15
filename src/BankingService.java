public interface BankingService{
    String getServiceName();
    void process(BankAccount account, double amount);
}
