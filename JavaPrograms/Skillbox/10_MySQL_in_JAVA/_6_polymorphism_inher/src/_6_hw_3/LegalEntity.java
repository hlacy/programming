package _6_hw_3;

public class LegalEntity extends Client{
    @Override
    public void withdrawFunds(Client client, double amountFunds) {
        client.setAccountBalance(client.getAccountBalance() - 1.01 * amountFunds);
    }

    @Override
    public void replenishmentFunds(Client client, double amountFunds) {
        client.setAccountBalance(client.getAccountBalance() + amountFunds);
    }

    @Override
    public void conditionsWithdrawReplenishment() {
        System.out.println("Withdraws occur with bank commission 1%.\n" +
                "Replenishments occur without bank commission");
    }
}
