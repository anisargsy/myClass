package myhomeworkpackage;

//Create a class called myhomeworkpackage.sub.BankAccount that has instance variables for account number and balance.
// Add methods called deposit and withdraw that allow deposits and withdrawals to the account
public class BankAccount {
    int accountNumber;
    int accountBalance;

    public BankAccount(int accountNumber, int accoutBalance) {
        this.accountNumber = accountNumber;
        this.accountBalance = accoutBalance;
    }

    public int deposit(int getDeposit) {
        accountBalance = accountBalance + getDeposit;
        return accountBalance;
    }

    public int withdraw(int getWithdraw) {
        accountBalance = accountBalance - getWithdraw;
        return accountBalance;
    }

    public static void main(String[] args) {
        BankAccount myObj1 = new BankAccount(1,30);
        myObj1.deposit(20);
        myObj1.deposit(70);
        myObj1.withdraw(300);
        System.out.println(myObj1.accountBalance);
    }
}
