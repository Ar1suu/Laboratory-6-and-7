public class BankingSystem {
    public static void main(String[] args){

        BankAccount savings = new SavingsAccount("Brian Trimotcha", 2000);
        BankAccount checking = new CheckingAccount("Justin Bongat", 5000);
        BankAccount business = new BusinessAccount("Amr Calaor", 1000);

        BankingService deposit = new DepositService();
        BankingService withdraw = new WithdrawalService();
        BankingService interest = new InterestService();


        System.out.println("\n=== METHOD OVERRIDING ===");

        savings.displaySummary();

        checking.displaySummary();

        business.displaySummary();

        // Demonstrating Compile-Time Polymorphism
        System.out.println("\n=== METHOD OVERLOADING ===");

        business.deposit(100);

        business.deposit(200, "Cash");

        business.deposit(300, "Online Transfer", "REF-001");


        processService(deposit, business, 1500);
        processService(withdraw, checking, 1000);
        processService(interest, savings, 100);
    }


    public static void processService(
            BankingService service,
            BankAccount account,
            double amount) {

        System.out.println("\nService: " + service.getServiceName());

        System.out.println("Balance Before: " + account.getBalance());

        service.process(account, amount);
    }

}
