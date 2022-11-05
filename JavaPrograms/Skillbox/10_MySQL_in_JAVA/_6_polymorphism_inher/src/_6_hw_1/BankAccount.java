package _6_hw_1;

public class BankAccount {
    private double accountBalance;

    public void getAccountBalance(){
        System.out.println("Account balance: " + this.accountBalance);
    }

    public void depositFunds(double accountBalance){
        this.accountBalance += accountBalance;
    }

    public void withdrawFunds(double accountBalance){
        this.accountBalance -= accountBalance;
    }
    boolean send(BankAccount receiver, double amount){
        double primaryAccountBalance = receiver.accountBalance;
        withdrawFunds(amount);
        if (receiver.accountBalance < primaryAccountBalance)
            return true;
        else return false;
    }

}
