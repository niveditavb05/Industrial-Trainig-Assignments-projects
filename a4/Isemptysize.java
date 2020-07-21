import java.util.*;
public class Isemptysize
{
    public static void main(String[] args) 
    {
        ArrayList<String> list = new ArrayList<>();
         
        System.out.println("list is empty="+list.isEmpty());     
         
        list.add("A");
         
        System.out.println("list is empty="+list.isEmpty());     
         
        list.clear();
         
        System.out.println("list is empty="+list.isEmpty());     
list.add("n");
System.out.println("list is empty="+list.size());
list.clear();
System.out.println("list is empty="+list.size());

    }
}