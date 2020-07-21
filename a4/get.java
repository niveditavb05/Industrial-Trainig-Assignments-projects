import java.util.ArrayList;

public class get
 {
   public static void main(String[] args) 
{
       ArrayList<Integer> arrlist = new ArrayList<Integer>(5);
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