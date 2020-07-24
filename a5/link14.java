import java.util.*; 
  
public class link14
 { 
    public static void main(String[] args) throws Exception 
    { 
        try { 
  
         
            LinkedList<Integer> arrlist = new LinkedList<Integer>(); 
            arrlist.add(1); 
            arrlist.add(2); 
            arrlist.add(3); 
            arrlist.add(4); 
            arrlist.add(5);  
            System.out.println("Before operation: " + arrlist); 
            int size = arrlist.size(); 
            System.out.println("Size of list = "+ size); 
        } 
  
        catch (IndexOutOfBoundsException e) { 
  
            System.out.println("Exception thrown: " + e); 
        } 
    } 
} 