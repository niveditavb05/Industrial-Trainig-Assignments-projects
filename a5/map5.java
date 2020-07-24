import java.util.HashMap; 
  
public class map5
{ 
    public static void main(String[] args) 
    { 
        
        HashMap<String, Integer> map  = new HashMap<>();  
        map.put("vishal", 10); 
        map.put("sachin", 30); 
        map.put("vaibhav", 20);  
        System.out.println(map); 
        if (map.containsKey("vishal")) 
{ 
            Integer a = map.get("vishal"); 
            System.out.println("value for key" + " \"vishal\" is:  " + a); 
        } 
    } 
} 