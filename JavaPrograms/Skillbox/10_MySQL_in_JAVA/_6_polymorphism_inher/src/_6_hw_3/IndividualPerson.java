package _6_hw_3;

public class IndividualPerson extends Client{
    @Override
    public void withdrawFunds(Client client, double amountFunds) {
        client.setAccountBalance(client.getAccountBalance() - amountFunds);
    }

    @Override
    public void replenishmentFunds(Client client, double amountFunds) {
        client.setAccountBalance(client.getAccountBalance() + amountFunds);
    }

    @Override
    public void conditionsWithdrawReplenishment() {
        System.out.println("Withdraw and replenishments occur without bank commission");
    }
}
