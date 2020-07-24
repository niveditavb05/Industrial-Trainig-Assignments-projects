import java.util.HashMap; 
import java.util.Map; 
  
public class map6
{ 
    public static void main(String[] args) 
    { 
        HashMap<String, Integer> map = new HashMap<>(); 
  
        map.put("vishal", 10); 
        map.put("sachin", 30); 
        map.put("vaibhav", 20); 
  
        for (Map.Entry<String, Integer> e : map.entrySet()) 
            System.out.println(e.getKey() + " " + e.getValue()); 
    } 
} 