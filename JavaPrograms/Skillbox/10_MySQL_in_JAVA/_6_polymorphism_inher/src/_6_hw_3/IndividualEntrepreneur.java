package _6_hw_3;

public class IndividualEntrepreneur extends Client{
    @Override
    public void withdrawFunds(Client client, double amountFunds) {
        client.setAccountBalance(client.getAccountBalance() - amountFunds);
    }

    @Override
    public void replenishmentFunds(Client client, double amountFunds) {
        if (amountFunds < 1000){
            client.setAccountBalance(client.getAccountBalance() + 0.99 * amountFunds);
        } else {
            client.setAccountBalance(client.getAccountBalance() + 0.995 * amountFunds);
        }
    }

    @Override
    public void conditionsWithdrawReplenishment() {
        System.out.println("Withdraws occur without bank commission.\n" +
                "Replenishments occur with commission 1% if amount lower than 1000 RUB and" +
                " 0,5% if amount bigger or equals 1000 RUB");

    }
}
