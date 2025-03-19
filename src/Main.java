public class Main {
    public static void main(String[] args) {
            BankCustomers sepah = new BankCustomers();
            sepah.addAccount(new SavingAccount("5892191509876543", "Sara Saadati", 700000));
            sepah.addAccount(new SavingAccount("5892191512345678", "Fateme Mortazavi", 234));
            sepah.addAccount(new SavingAccount("5892191512345678", "Reyhane Amanoolahi", 100000));

            sepah.addAccount(new TransactionAccount("5892191523234444", "Reza Karimi", 0));
            sepah.addAccount(new TransactionAccount("5892191598789034", "Paria sattari", 23040));
            sepah.addAccount(new TransactionAccount("5892191534567682", "Melorin Soleimani", 40002));

            BankAccount unvalidAccount = sepah.findAccount("5892101556845322");
            BankAccount account1 = sepah.findAccount("5892191509876543");
            BankAccount account2 = sepah.findAccount("5892191512345678");
            BankAccount account3 = sepah.findAccount("5892191512345678");
            BankAccount account4 = sepah.findAccount("5892191523234444");
            BankAccount account5 = sepah.findAccount("5892191598789034");
            BankAccount account6 = sepah.findAccount("5892191534567682");

            account1.getBalance();
            account1.deposit(100);
            account1.getBalance();

            account3.deposit(-12);


            account3.calculateInterest();
            account3.getBalance();
            account5.calculateInterest();
            account5.getBalance();

           account1.withdraw(1000);
           account2.withdraw(800);
           account3.withdraw(-34);

           account4.withdraw(510);
           account5.withdraw(200);
           account6.withdraw(-9);

           sepah.showAllBalances();






        }
    }