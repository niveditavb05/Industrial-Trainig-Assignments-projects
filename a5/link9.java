import java.util.*;

public class link9
{
   public static void main(String[] args)
{
      LinkedList<Integer> arrlist = new LinkedList<Integer>();
      arrlist.add(15);
      arrlist.add(22);
      arrlist.add(30);
      arrlist.add(40);
System.out.println("initial linkedlist :");
for (Integer number : arrlist)
 {
         System.out.println("Number = " + number);

      }
      arrlist.add(2,25);
        System.out.println("after inserting the new element at index 2 of linkedlist :");
      for (Integer number : arrlist) {
         System.out.println("Number = " + number);
      }  
   }
}   