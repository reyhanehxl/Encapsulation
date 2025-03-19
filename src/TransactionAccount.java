public class TransactionAccount extends BankAccount{
    private final double overDraftLimit = 500;
    public TransactionAccount(String accountHolderName, String accountNumber, double initialBalance){
        super(accountHolderName, accountNumber, initialBalance);
    }
    @Override
    public void calculateInterest(){
        System.out.println("This account have no interests!");
    }

    @Override
    public void withdraw(double amount) {
        if(amount < 0){
            System.out.println("Please enter a valid amount.");
            return;
        }
        if(balance + overDraftLimit - amount > 0){
            balance -= amount;
            System.out.println(amount + " reduced from " + getAccountNumber());
            return;
        }
            System.out.println("withdrawn denied.");

    }
}
