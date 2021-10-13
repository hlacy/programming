

public class scops {
    public static void main(String[] args) {
        int a, b, c;
        a=0;
        if (false & (++a<10))
        System.out.println("- " + a);
        System.out.println("++0 = " + a);
        a=0;
        if (false && (++a<10))
        System.out.println("- " + a);
        System.out.println("a++ = " + a);
        a=0;
        if (false & (a++<10))
        System.out.println("- " + a);
        System.out.println("++0 = " + a);
        a=0;
        if (false && (a++<10))
        System.out.println("- " + a);
        System.out.println("a++ = " + a);

        
        
    }
    
}
