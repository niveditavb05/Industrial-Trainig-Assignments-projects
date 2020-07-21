import java.util.ArrayList; 
  
public class remall 
{ 
    public static void main(String[] args) 
    { 
        ArrayList<String> list = new ArrayList<>(); 
        list.add("abc"); 
        list.add("xyz"); 
        list.add("pqr"); 
        list.add("lmn"); 
        System.out.println("ArrayList: " + list);  
        System.out.println("Size of ArrayList = "+ list.size());  
        list.clear(); 
        System.out.println("\nAfter clear\n\n" + "ArrayList: " + list); 
        System.out.println("Size of ArrayList = " + list.size()); 
    } 
} 
