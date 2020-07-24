import java.io.*; 
import java.util.*; 
  
public class link1
{ 
public static void main(String[] args) 
    {  
        LinkedList<Integer> al = new LinkedList<Integer>(); 
        al.add(15); 
        al.add(20); 
        al.add(25); 
System.out.println("initial linkedlist :");
        for (Integer number : al) 
{ 
            System.out.println("Number = " + number); 
}
al.add(66); 
System.out.println("after appending  linkedlist :");
        for (Integer number : al)
 { 
            System.out.println("Number = " + number); 


        } 
    } 
} 