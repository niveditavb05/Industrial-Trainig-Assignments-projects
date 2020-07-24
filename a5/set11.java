import java.io.*; 
import java.util.Set; 
import java.util.*; 
  
class set11
{ 
    public static void main (String[] args) 
    { 
        Set<Integer> al = new HashSet<Integer>(); 
        al.add(10); 
        al.add(20); 
        al.add(30); 
        al.add(40); 
  
        Object[] objects = al.toArray(); 
        for (Object obj : objects) 
        System.out.print(obj + " "); 
    } 
} 