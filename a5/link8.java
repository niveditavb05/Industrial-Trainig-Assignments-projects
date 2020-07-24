import java.util.*;
public class link8
{
    public static void main(String[] args) 
    {
        LinkedList<String> list = new LinkedList<>();
         
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