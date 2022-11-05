import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

public class _5_hw_3 {
    public static void todo(){
        TreeMap<String, String> phoneBook = new TreeMap<>();

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            final String contactData = scanner.nextLine();
            if (contactData.equalsIgnoreCase("LIST")){
                printPhoneBook(phoneBook);
                continue;
            }
            else if (checkingPhoneOrNumber(contactData) == 0){
                ///phone - key
                System.out.println("phone");
                containsPhone(phoneBook, contactData);
            }else if (checkingPhoneOrNumber(contactData) == 1){
                ///name - value
                System.out.println("name");
                containsName(phoneBook, contactData);
            } else {
                System.out.println("Incorrect data");
                continue;
            }

        }
    }

    private static void containsPhone(TreeMap<String, String> phoneBook, String contactData){
         if (phoneBook.containsKey(contactData)){
             System.out.println(" Phone  - " + contactData + " Name - " + phoneBook.get(contactData));
         } else{
             System.out.println("Enter a name");
             String name  = new Scanner(System.in).nextLine();
             if (checkingPhoneOrNumber(name) != 1){
                 System.out.println("Incorrect name");
             } else {
                 phoneBook.put(contactData, name);
             }
         }
    }

    private static void containsName(TreeMap<String, String> phoneBook, String contactData){
        if (phoneBook.containsValue(contactData)){
            System.out.println(" Phone  - " + searchingKey(phoneBook, contactData) + " Name - " + contactData);
        } else{
            System.out.println("Enter a phone");
            String phone  = new Scanner(System.in).nextLine();
            if (checkingPhoneOrNumber(phone) != 0){
                System.out.println("Incorrect phone");
            } else {
                phoneBook.put(phone, contactData);
            }
        }
    }

    private static String searchingKey(TreeMap<String, String> phoneBook, String contactData){
        String Key= new String();
        for (String k : phoneBook.keySet())
        {
            if (phoneBook.get(k).equals(contactData) )  {
                Key = k;
                break;
            }
        }
        return Key;
    }

    private static int checkingPhoneOrNumber(String str){
        String temp = str;
//        System.out.println(temp);
        if (temp.matches(".*(\\p{L}(?=.*\\d)|\\d(?=.*\\p{L})).*")){
            System.out.println("Enter a phone number or a name");
            return -1;
        }
        else if (temp.replaceAll("\\D", "") == ""){
            return  1;//name
        }
        return 0;//phone
    }

    private static void printPhoneBook(TreeMap<String, String> phoneBook){
        for (String key: phoneBook.keySet()){
            System.out.println(key + " - " + phoneBook.get(key));
        }
    }
}
