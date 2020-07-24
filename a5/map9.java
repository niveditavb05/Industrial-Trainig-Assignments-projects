import java.util.*; 
  
public class map9
{ 
    public static void main(String[] args) 
    { 
        HashMap<String, Integer> hash_map = new HashMap<String, Integer>(); 
        hash_map.put("Geeks", 10); 
        hash_map.put("4", 15); 
        hash_map.put("Geeks", 20); 
        hash_map.put("Welcomes", 25); 
        hash_map.put("You", 30); 
        System.out.println("The Mappings are: " + hash_map); 
        System.out.println("Is the map empty? " + hash_map.isEmpty()); 
    } 
} 