import java.util.*;

public class set3{
    public static void main(String[] args)
 {

       
        HashSet<String> cats1 = new HashSet<>();
        cats1.add("Max");
        cats1.add("Mittens");
        cats1.add("Fluffy");
        System.out.println(cats1);
        HashSet<String> cats2 = new HashSet<>();
        cats2.add("Meow");
        System.out.println(cats2);

  
        cats2.addAll(cats1);
        System.out.println(cats2);
    }
}