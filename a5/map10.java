import java.util.*; 
  
public class map10
{ 
public static void main(String[] args) 
{ 
    HashMap<Integer, String> hash_map = new HashMap<Integer, String>();  
    hash_map.put(10, "nivedita"); 
    hash_map.put(15, "birajdar"); 
    hash_map.put(20, "and shruti"); 
    hash_map.put(25, "Welcomes"); 
    hash_map.put(30, "You");  
    System.out.println("Initial Mappings are: " + hash_map);  
    String returned_value = (String)hash_map.remove(20); 
    System.out.println("Returned value is: "+ returned_value); 
    System.out.println("New map is: "+ hash_map); 
} 
} 