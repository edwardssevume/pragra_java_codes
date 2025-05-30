public class BankAccount {
    String accountHolderName;
    String accountNumber;
    double balance;
    String name;

    public BankAccount(String accountHolderName, String accountNumber, double balance){
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public BankAccount(String accountHolderName, String accountNumber){
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        balance = 0;
    }

    void deposit(double amount){
        balance += amount;
        System.out.println(accountHolderName + " has $" + balance);
    }

    void withdraw(double amount){
        if(amount <= balance){
            balance-= amount;
            System.out.println(accountHolderName + " has $" + balance);
        }else{
            System.out.println("Withdraw by " + accountHolderName + " fails ");
        }
    }

    public void transfer(double amount, BankAccount acc){
        if(this.balance < amount){
            System.out.println("Transfer fails");
        }else {
            this.balance -= amount;
            acc.balance += amount;
            System.out.println("Account of " + this.accountHolderName + " becomes $" + this.balance);
            System.out.println("Account of " + acc.name + " becomes $" + acc.balance);
        }
    }

    void displayAccountInfo(String accountHolderName, String accountNumber, double balance){
        System.out.println(accountHolderName);
        System.out.println(accountNumber);
        System.out.println("Balance is:" + balance);
    }

}
