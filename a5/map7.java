import java.util.*; 
  
public class map7
{ 
    public static void main(String[] args) 
    { 
        HashMap<Integer, String> hash_map = new HashMap<Integer, String>(); 
        hash_map.put(10, "n"); 
        hash_map.put(15, "4"); 
        hash_map.put(20, "v"); 
        hash_map.put(25, "b"); 
        hash_map.put(30, "You");  
        System.out.println("Initial Mappings are: " + hash_map); 
        hash_map.clear(); 
        System.out.println("Finally the maps look like this: " + hash_map); 
    } 
} 