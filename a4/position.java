import java.util.ArrayList;

public class position 
{
   public static void main(String[] args)
{
      ArrayList<Integer> arrlist = new ArrayList<Integer>(5);
      arrlist.add(15);
      arrlist.add(22);
      arrlist.add(30);
      arrlist.add(40);
System.out.println("initial arraylist :");
for (Integer number : arrlist)
 {
         System.out.println("Number = " + number);

      }
      arrlist.add(2,25);
        System.out.println("after inserting the new element at index 2 of arrlist :");
      for (Integer number : arrlist) {
         System.out.println("Number = " + number);
      }  
   }
}   