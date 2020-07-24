import java.util.*; 
  
public class map13
{ 
public static void main(String[] args) 
{ 
    HashMap<Integer, String> hash_map = new HashMap<Integer, String>();  
    hash_map.put(10, "Geeks"); 
    hash_map.put(15, "4"); 
    hash_map.put(20, "Geeks"); 
    hash_map.put(25, "Welcomes"); 
    hash_map.put(30, "You"); 
    System.out.println("Initial Mappings are: " + hash_map);  
    HashMap<Integer, String> new_hash_map = new HashMap<Integer, String>(); 
    new_hash_map.putAll(hash_map); 
    System.out.println("The new map looks like this: " + new_hash_map); 
} 
} 