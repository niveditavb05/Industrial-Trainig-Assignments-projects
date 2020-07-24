import java.util.List; 
import java.util.*; 
  
public class link12 
{ 
    public static void main(String[] args) 
    { 
        List<Integer> al = new LinkedList<>(); 
        al.add(10); 
        al.add(20); 
        al.add(30); 
        al.add(1); 
        al.add(2);
System.out.println("initial linkedlist :" +al); 
        al.remove(1); 
        al.remove(1); 
  
        System.out.println("Modified linkedList : " + al); 
    } 
} 