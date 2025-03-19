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
        if(balance + overDraftLimit - amount > 0){
            balance -= amount;
            System.out.println(amount + " withdrawn. balance : " + balance);
        }
        else{
            System.out.println("withdrawn denied.");
        }
    }
}
