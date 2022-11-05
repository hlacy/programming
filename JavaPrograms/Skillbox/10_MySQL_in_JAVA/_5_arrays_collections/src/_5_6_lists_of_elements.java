import java.util.ArrayList;

public class _5_6_lists_of_elements {
    public static void todo(){
//        ArrayList<String> todoList = new ArrayList<>();
//        todoList.add("Our first business");
//        todoList.add(1, "Second business");
//        todoList.add("third business");
//        for (String arrayList: todoList){
//            System.out.println(arrayList);
//        }
//        System.out.println();
//        for (int i = 0; i < todoList.size(); i++)
//            System.out.println(todoList.get(i));
        ArrayList<String> todoList  = new ArrayList<>(){{
           add("first");
           add("second");
           add(0,"third");
        }};
        for (String str: todoList)
            System.out.println(str);
        System.out.println();
        todoList.remove(1);
        for (String str: todoList)
            System.out.println(str);

    }
}
