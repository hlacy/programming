package main_progs;

import com.company.set.Hash_Set;
import com.company.set.Hash_Set.Inner_class;

public class CommonMain {
    public static String x;

    public static void main(String[] arg){
        CommonMain fg  = new CommonMain();
        fg.x = "123";
        System.out.println(fg.x);
        Hash_Set hash_set = new Hash_Set();
        Hash_Set.Inner_class hain = hash_set.new Inner_class();
        String wdw = new String();
        wdw = hain.func1234();
        System.out.println(wdw);
    }



}
