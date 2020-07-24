import java.util.*; 
  
public class set7
{ 
    public static void main(String[] args) 
    { 
        HashSet<String> list = new HashSet<>(); 
        list.add("abc"); 
        list.add("xyz"); 
        list.add("pqr"); 
        list.add("lmn"); 
        System.out.println("hashset: " + list);  
        System.out.println("Size of hashset = "+ list.size());  
        list.clear(); 
        System.out.println("\nAfter clear\n\n" + "hashset: " + list); 
        System.out.println("Size of hashset = " + list.size()); 
    } 
} 
