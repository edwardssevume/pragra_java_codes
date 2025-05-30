public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount edward = new BankAccount("Edward", "12325456", 2000.0);
        edward.deposit(5000.0);
        //edward.displayAccountInfo();
        BankAccount tom = new BankAccount("Tom", "12320856", 3500.0);
        tom.deposit(200.0);
        tom.transfer(100.0, edward);
        edward.withdraw(50.0);
    }
}
