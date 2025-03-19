import java.util.ArrayList;

public class BankCustomers{
    private ArrayList<BankAccount> accountList;

    public BankCustomers(){

        accountList = new ArrayList<>();
    }
    public void addAccount(BankAccount account){
        accountList.add(account);
        System.out.println("Account added: " + account.getAccountNumber());
    }

    public void showAllBalances(){
        for(BankAccount account : accountList){
            System.out.println("Account: " + account.getAccountNumber() +"\nHolder: " + account.getAccountHolderName() + "\nBalance: $" + account.getBalance());
        }
    }
    public BankAccount findAccount(String accountNumber){
        for(BankAccount account : accountList){
            if(account.getAccountNumber().equals(accountNumber))
                return account;

        }
        System.out.println("Account with this number not found.");
        return null;
    }

}
