import java.util.*; 
  
public class map11 
{ 
    public static void main(String[] args) 
    {  
        Map<String, String> map = new HashMap<>(); 
        map.put("Name", "Aman"); 
        map.put("Address", "Kolkata"); 
        System.out.println("Map: " + map); 
        map.compute("Name", (key, val)  -> val.concat(" Singh")); 
        map.compute("Address", (key, val)  -> val.concat(" West-Bengal")); 
        System.out.println("New Map: " + map); 
    } 
} 