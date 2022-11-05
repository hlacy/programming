package _6_hw_1;

public class CardAccount extends BankAccount{
    @Override
    public void withdrawFunds(double accountBalance) {
        super.withdrawFunds(accountBalance + accountBalance * 0.01);
    }
}
