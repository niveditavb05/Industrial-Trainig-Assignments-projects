import java.util.*; 
  
public class map12
{ 
    public static void main(String[] args) 
    { 
        HashMap<String, Integer>  map1 = new HashMap<>(); 
        map1.put("key1", 1); 
        map1.put("key2", 2); 
        map1.put("key3", 3); 
        map1.put("key4", 4); 
        System.out.println("HashMap1: "+ map1.toString()); 
        map1.replaceAll((key, oldValue) -> oldValue * oldValue); 
        System.out.println("New HashMap: "+ map1); 
    } 
} 