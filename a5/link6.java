import java.util.*;

public class link6
 {
   public static void main(String[] args) 
{
       LinkedList<Integer> arrlist = new LinkedList<Integer>();
      arrlist.add(15);
      arrlist.add(22);
      arrlist.add(30);
      arrlist.add(40);
      for (Integer number : arrlist) 
{
         System.out.println("Number = " + number);
      } 
      int retval = arrlist.get(2);
      System.out.println("Retrieved element is = " + retval);	   
   }
}   