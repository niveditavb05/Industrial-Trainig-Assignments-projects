import java.util.List; 
import java.util.*; 
  
public class set9 
{ 
    public static void main(String[] args) 
    { 
        Set<Integer> al = new HashSet<>(); 
        al.add(10); 
        al.add(20); 
        al.add(30); 
        al.add(1); 
        al.add(2);
System.out.println("initial hashset :" +al); 
        al.remove(1); 
        al.remove(1); 
  
        System.out.println("Modified hashset : " + al); 
    } 
} 