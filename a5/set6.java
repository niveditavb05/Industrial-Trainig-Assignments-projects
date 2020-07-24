import java.util.*;
public class set6
{
    public static void main(String[] args) 
    {
        HashSet<String> list = new HashSet<>();
         
        System.out.println("set is empty="+list.isEmpty());     
         
        list.add("A");
         
        System.out.println("set is empty="+list.isEmpty());     
         
        list.clear();
         
        System.out.println("set is empty="+list.isEmpty());     
list.add("n");
System.out.println("set is empty="+list.size());
list.clear();
System.out.println("set is empty="+list.size());

    }
}