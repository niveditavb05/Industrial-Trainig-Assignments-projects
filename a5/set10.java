import java.util.*; 
  
public class set10
 { 
    public static void main(String[] args) throws Exception 
    { 
        try { 
  
         
            HashSet<Integer> arrlist = new HashSet<Integer>(); 
            arrlist.add(1); 
            arrlist.add(2); 
            arrlist.add(3); 
            arrlist.add(4); 
            arrlist.add(5);  
            System.out.println("Before operation: " + arrlist); 
            int size = arrlist.size(); 
            System.out.println("Size of set = "+ size); 
        } 
  
        catch (IndexOutOfBoundsException e) { 
  
            System.out.println("Exception thrown: " + e); 
        } 
    } 
} 