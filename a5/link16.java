import java.io.*; 
import java.util.List; 
import java.util.*; 
  
class link16
{ 
    public static void main (String[] args) 
    { 
        List<Integer> al = new LinkedList<Integer>(); 
        al.add(10); 
        al.add(20); 
        al.add(30); 
        al.add(40); 
  
        Object[] objects = al.toArray(); 
        for (Object obj : objects) 
        System.out.print(obj + " "); 
    } 
} 