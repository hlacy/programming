import com.sun.source.tree.Tree;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;

public class _5_8_set {
    public static void todo(){
        ArrayList<String> arrayList = new ArrayList<>();
        HashSet<String> hashSet = new HashSet<>();

        hashSet.add("first");
        hashSet.add("second");
        hashSet.add("third");
        hashSet.add("second");
        System.out.println(hashSet.contains("втОрое"));

        for (String s:hashSet)
            System.out.println(hashSet);
    }
}
