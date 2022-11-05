import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;

public class Customer
{
    private String name;
    private String phone;
    private String eMail;

    public Customer(String name, String phone, String eMail) throws Exception {
        this.name = name;

        this.phone = isValidPhoneNumber(phone);
        if (isValidEmailAddress(eMail))  this.eMail = eMail;
    }
//    ^((8|\+7)[\- ]?)?(\(?\d{3}\)?[\- ]?)?[\d\- ]{7,10}$

    public static String isValidPhoneNumber(String phone) throws Exception {
        if (phone.replaceAll("[^0-9]", "").length() == 11) {
            return phone.replaceAll("[^0-9]", "");
        } else throw new Exception();
    }
    public static boolean isValidEmailAddress(String email) {
        boolean result = true;
        try {
            InternetAddress emailAddr = new InternetAddress(email);
            emailAddr.validate();
        } catch (AddressException ex) {
            result = false;
        }
        return result;
    }
    public String toString()
    {
        return name + " - " + eMail + " - " + phone;
    }
}
