import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.sound.midi.Soundbank;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class _5_hw_2 {
    public static void startCommand() throws Exception {
        TreeSet<String> emails = new TreeSet<>();

        System.out.println("Write your command");
        Scanner scanner = new Scanner(System.in);
        String str = new String();
        while (scanner.hasNext()) {
            str = scanner.nextLine();
            if (str.equalsIgnoreCase("STOP")) break;
            if (str.equalsIgnoreCase("SHOW")) {
                System.out.println(emails);
                continue;
            }

            parsingCommands(str, emails);
        }
        System.out.println(emails);
    }


    public static void parsingCommands(String str, TreeSet<String> emails) throws Exception {

        ArrayList<String> list = new ArrayList(List.of(str.split(" ")));

        switch (list.get(0)) {
            case ("LIST"):
                listCommand(list, emails);
                break;
            case ("ADD"):
                addCommand(list, emails);
                if (!isCorrectEmail(list.get(1))){
                    System.out.println("An email is incorrect");
                    return;
                }
                break;
            default:
                System.out.println("wrong command");
                break;
        }
    }

    public static boolean isCorrectEmail(String email) throws AddressException {
        boolean result = true;
        try {
            InternetAddress emailAddr = new InternetAddress(email);
            emailAddr.validate();
        } catch (AddressException ex) {
            result = false;
        }
        return result;
    }

    public static void listCommand(ArrayList list, TreeSet<String> emails) {
        System.out.println("list");
        try {
            for (String s: emails) {
                System.out.println(s);
            }
        } catch (IndexOutOfBoundsException ioobe){
            System.out.println("List is null");
        }

    }

    public static void addCommand(ArrayList list, TreeSet<String> emails) throws Exception {
         emails.add(String.valueOf(list.get(1)));

    }
}