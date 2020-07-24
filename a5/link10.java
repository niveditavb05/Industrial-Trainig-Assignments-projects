import java.util.*; 
  
public class link10
{ 
    public static void main(String[] args) 
    { 
        LinkedList<String> list = new LinkedList<>(); 
        list.add("abc"); 
        list.add("xyz"); 
        list.add("pqr"); 
        list.add("lmn"); 
        System.out.println("linkedList: " + list);  
        System.out.println("Size of linkedList = "+ list.size());  
        list.clear(); 
        System.out.println("\nAfter clear\n\n" + "linkedList: " + list); 
        System.out.println("Size of linkedList = " + list.size()); 
    } 
} 
