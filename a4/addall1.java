import java.util.ArrayList;

public class addall1 {
    public static void main(String[] args)
 {

       
        ArrayList<String> cats1 = new ArrayList<>();
        cats1.add("Max");
        cats1.add("Mittens");
        cats1.add("Fluffy");
        System.out.println(cats1);
        ArrayList<String> cats2 = new ArrayList<>();
        cats2.add("Meow");
        System.out.println(cats2);

  
        cats2.addAll(cats1);
        System.out.println(cats2);
    }
}