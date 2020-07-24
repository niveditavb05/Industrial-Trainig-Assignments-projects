import java.util.*;

public class link3{
    public static void main(String[] args)
 {

       
        LinkedList<String> cats1 = new LinkedList<>();
        cats1.add("Max");
        cats1.add("Mittens");
        cats1.add("Fluffy");
        System.out.println(cats1);
        LinkedList<String> cats2 = new LinkedList<>();
        cats2.add("Meow");
        System.out.println(cats2);

  
        cats2.addAll(cats1);
        System.out.println(cats2);
    }
}