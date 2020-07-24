import java.util.*; 
  
class set14 { 
    public static void main(String args[]) 
    {  
        HashSet<String>  set = new HashSet<String>(); 
  
        set.add("n"); 
        set.add("v"); 
        set.add("b"); 
        set.add("10"); 
        set.add("20");  
        System.out.println("HashSet 1: "+ set);  
        HashSet<String> set2 = new HashSet<String>(); 
        set2.add("n"); 
        set2.add("v"); 
        set2.add("b"); 
        set2.add("10"); 
        set2.add("20"); 
        System.out.println("HashSet 2: "+ set2); 
        System.out.println("\nDoes set 1 contains set 2: " + set.containsAll(set2)); 
    } 
} 