package _6_hw_3;

public abstract class Client {
    private double accountBalance;

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public abstract void withdrawFunds (Client client, double amountFunds);
    public abstract void replenishmentFunds(Client client, double amountFunds);
    public abstract void conditionsWithdrawReplenishment();
    public void printAccountBalance(Client client){
        System.out.println(client.getAccountBalance());
    }
}
