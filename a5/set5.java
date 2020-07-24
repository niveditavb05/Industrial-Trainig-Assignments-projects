import java.util.*;
import java.util.List;
public class set5
 {
   public static void main(String[] args)
 {
       HashSet<String>  aList = new HashSet<String>();
      aList.add("A");
      aList.add("B");
      aList.add("C");
      aList.add("D");
      aList.add("E");
      if(aList.contains("C"))
         System.out.println("The element C is available in the hashset");
      else
         System.out.println("The element C is not available in the hashset");
      if(aList.contains("H"))
         System.out.println("The element H is available in the hashset");
      else
         System.out.println("The element H is not available in the hashset");
   }
}