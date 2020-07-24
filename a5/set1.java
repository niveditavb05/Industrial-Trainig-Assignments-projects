import java.io.*; 
import java.util.*; 
  
public class set1
{ 
public static void main(String[] args) 
    {  
        HashSet<Integer> al = new HashSet<Integer> (); 
        al.add(15); 
        al.add(20); 
        al.add(25); 
System.out.println("initial hashset :");
        for (Integer number : al) 
{ 
            System.out.println("Number = " + number); 
}
al.add(66); 
System.out.println("after appending  hashset :");
        for (Integer number : al)
 { 
            System.out.println("Number = " + number); 


        } 
    } 
} 