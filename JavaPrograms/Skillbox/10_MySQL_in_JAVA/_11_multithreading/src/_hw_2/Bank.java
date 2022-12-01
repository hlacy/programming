package _hw_2;

import java.util.HashMap;
import java.util.Random;
import java.util.function.Supplier;

public class Bank
{
    private HashMap<String, Account> accounts;
//    private long allMoney = (s)-> {
//        for (Account sumAllMoney: accounts.values()) {
//            s += sumAllMoney.getMoney();
//        }
//    };
    final Supplier<Double> allMoney = ()-> {
        Double s = 0D;
        for (Account sumAllMoney: accounts.values()) {
            s += sumAllMoney.getMoney();
        }
        return s;
    };
    private final Random random = new Random();

//    private void setAllMoney() {
//        for (Account sumAllMoney: accounts.values()){
//            this.allMoney += sumAllMoney.getMoney();
//        }
//    }

    public HashMap<String, Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(HashMap<String, Account> accounts) {
        this.accounts = accounts;
    }

    public synchronized boolean isFraud(String fromAccountNum, String toAccountNum, Double amount)
        throws InterruptedException
    {
        Thread.sleep(1000);
        return random.nextBoolean();
    }

    /**
     * TODO: реализовать метод. Метод переводит деньги между счетами.
     * Если сумма транзакции > 50000, то после совершения транзакции,
     * она отправляется на проверку Службе Безопасности – вызывается
     * метод isFraud. Если возвращается true, то делается блокировка
     * счетов (как – на ваше усмотрение)
     */
    public void transfer(String fromAccountNum, String toAccountNum, Double amount) throws InterruptedException, BankException {
        Double allMoneyBeforeTrans = (Double s)->{
            for (Account sumAllMoney: accounts.values()) {
            s += sumAllMoney.getMoney();
            }
            return s;
        };

        if (transferChecking(fromAccountNum, toAccountNum, amount)){
            accounts.get(toAccountNum).setMoney(accounts.get(toAccountNum).getMoney() + amount);
            accounts.get(fromAccountNum).setMoney(accounts.get(fromAccountNum).getMoney() - amount);
        }
        if (amount > 50_000 && isFraud(fromAccountNum, toAccountNum, amount)){
            accounts.get(toAccountNum).setBlocked(true);
            accounts.get(fromAccountNum).setBlocked(true);
        }

    }

    public boolean transferChecking(String fromAccountNum, String toAccountNum, Double amount) throws BankException {
        if (fromAccountNum == null || toAccountNum == null){
//            throw new BankException("");
            return false;
        }
        if (getBalance(fromAccountNum) <= 0 || getBalance(toAccountNum) <= 0)
            return false;
        if (accounts.get(fromAccountNum).getAccNumber() == null || accounts.get(toAccountNum).getAccNumber() == null)
            return false;
        if (accounts.get(fromAccountNum).isBlocked() == true || accounts.get(toAccountNum).isBlocked() == true)
            return false;
        if (amount <= 0)
            return false;
        if (getBalance(fromAccountNum) < amount)
            return false;
        return true;
    }

    /**
     * TODO: реализовать метод. Возвращает остаток на счёте.
     */
    public Double getBalance(String accountNum)
    {
        return accounts.get(accountNum).getMoney();
    }
}
