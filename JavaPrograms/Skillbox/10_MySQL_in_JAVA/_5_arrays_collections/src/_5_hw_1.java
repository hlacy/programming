import org.w3c.dom.ls.LSOutput;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class _5_hw_1 {

    public static void startCommand() throws Exception {
        ArrayList<String> listBusiness = new ArrayList<>(){{
            add("first");
            add("second");
            add("third");
        }};
        System.out.println("Write your command");
        Scanner scanner = new Scanner(System.in);
        String str = new String();
        while (scanner.hasNext()){
            str = scanner.nextLine();
            if (str.equalsIgnoreCase("STOP")) break;
            if (str.equalsIgnoreCase("SHOW")){
                System.out.println(listBusiness);
                continue;
            }

            parsingCommands(str, listBusiness);
        }
        System.out.println(listBusiness);
    }
// while just STOP works

    public static void parsingCommands(String str, ArrayList<String> listBusiness) throws Exception {

        ArrayList<String> list = new ArrayList(List.of(str.split(" ")));
        System.out.println(listBusiness.get(0));
        System.out.println(list.toString());

        switch (list.get(0)){
            case ("LIST"):
                listCommand(list, listBusiness);
                break;
            case ("ADD"):
                if (list.size() < 3){
                    addCommand(list, listBusiness, 0);
                }
                else if (list.size() == 3){
                    addCommand(list, listBusiness, Integer.parseInt(list.get(2)));
                }
                break;
            case ("EDIT"):
                editCommand(list, listBusiness);
                break;
            case ("DELETE"):
                deleteCommand(listBusiness, Integer.parseInt(list.get(1)));
                break;
            default:
                System.out.println("wrong command");
                break;
        }
    }

    public static void listCommand(ArrayList list, ArrayList listBusiness){
        for (int i = 0; i < listBusiness.size(); i++){
            System.out.println(i + " - " + listBusiness.get(i));
        }
    }

    public static void addCommand(ArrayList list, ArrayList listBusiness, int index) throws Exception {
        if (index == 0) listBusiness.add(list.get(1));
        else if (index >= 0 && index <= (list.size() - 1)) {
            listBusiness.add(index, list.get(1));
        } else if (index >= 0 && index >= (list.size() - 1)) {
            listBusiness.add(list.size() - 1, list.get(1));
        } else throw new Exception("Wrong index");
    }

    public static void editCommand(ArrayList list, ArrayList listBusiness){//NEEDS WRITHE CHECKING
        listBusiness.set(Integer.parseInt(String.valueOf(list.get(1))), list.get(2));

    }
    public static void deleteCommand(ArrayList listBusiness, int i){
        System.out.println("delete");
        listBusiness.remove(i);
    }
}
