public abstract class BankAccount {
    final private String accountNumber;
    private String accountHolderName;
    protected double balance;

    public BankAccount(String accountNumber, String accountHolderName, double balance){
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public abstract void calculateInterest();
    public void deposit(double amount){
        if(amount < 0) {
            System.out.println("please enter a valid amount.");
            return;
        }
        this.balance += amount;
        System.out.println(amount + " added to " + this.accountNumber);
    }
    public void withdraw(double amount){
        if(this.balance - amount < 0){
            System.out.println("Insufficient balance.");
            return;
        }
        this.balance -= amount;
        System.out.println(amount + " reduced from " + this.accountNumber);
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }
}
