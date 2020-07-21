import java.io.*; 
import java.util.ArrayList; 
  
public class add
{ 
public static void main(String[] args) 
    {  
        ArrayList<Integer> arrlist = new ArrayList<Integer>(5); 
        arrlist.add(15); 
        arrlist.add(20); 
        arrlist.add(25); 
System.out.println("initial arraylist :");
        for (Integer number : arrlist) 
{ 
            System.out.println("Number = " + number); 
}
arrlist.add(66); 
System.out.println("after appending  arraylist :");
        for (Integer number : arrlist)
 { 
            System.out.println("Number = " + number); 


        } 
    } 
} 