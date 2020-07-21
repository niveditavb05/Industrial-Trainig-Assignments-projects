import java.util.ArrayList;

public class ensure
 {
   public static void main(String args[]) 
{

 
      ArrayList<Integer> arrlist = new ArrayList<Integer>(5);

  
      arrlist.add(10);
      arrlist.add(50);
      arrlist.add(30);
      
 
      arrlist.ensureCapacity(15);
arrlist.add(40);
arrlist.add(20);


     
      for (Integer number : arrlist) {
         System.out.println("Number = " + number);
      }
   }
}