import java.util.*; 
import java.util.HashSet; 
  
public class set13 { 
    public static void main(String args[]) 
    { 
        HashSet<String> set = new HashSet<String>();  
        set.add("Welcome"); 
        set.add("To"); 
        set.add("mindlabz"); 
        set.add("training"); 
        set.add("....."); 
        System.out.println("HashSet: " + set); 
        Iterator value = set.iterator(); 
        System.out.println("The iterator values are: "); 
        while (value.hasNext()) { 
            System.out.println(value.next()); 
        } 
    } 
} 