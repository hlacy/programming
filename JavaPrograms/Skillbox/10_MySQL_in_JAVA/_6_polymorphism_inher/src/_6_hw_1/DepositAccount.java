package _6_hw_1;

import javax.xml.crypto.Data;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DepositAccount extends BankAccount{
    private Calendar dateReplenishment = new GregorianCalendar();
    public Calendar dateRequest = new GregorianCalendar();

    public Calendar getDateReplenishment() {
        return dateReplenishment;
    }

    public void setDateReplenishment(Calendar dateReplenishment) {
        this.dateReplenishment = dateReplenishment;
    }

    public void withdrawFunds(double accountBalance){
        if (dateReplenishment.get(Calendar.MONTH) <= dateRequest.get(Calendar.MONTH + 1) &&
            dateReplenishment.get(Calendar.DAY_OF_MONTH) <= dateRequest.get(Calendar.DAY_OF_MONTH) &&
            dateReplenishment.get(Calendar.YEAR) <= dateRequest.get(Calendar.YEAR)){
            super.withdrawFunds(accountBalance);
        }
    }
}
