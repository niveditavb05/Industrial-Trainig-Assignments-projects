import java.util.*;

public class link13
{
   public static void main(String[] args) 
{
      LinkedList<Integer> arrlist = new LinkedList<Integer>();
      arrlist.add(15);
      arrlist.add(20);
      arrlist.add(25);
      arrlist.add(22);
      for (Integer number : arrlist) 
{
         System.out.println("Number = " + number);
      }

   
      arrlist.set(2,55);
        
   
      System.out.println("Printing new list:");
      for (Integer number : arrlist) 
{
         System.out.println("Number = " + number);
      } 
   }
}