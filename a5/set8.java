import java.util.*;
public class set8 
{
    public static void main(String[] args) 
    {
        HashSet<String> namesList = new HashSet<String>(Arrays.asList( "alex", "brian", "charles", "alex") );
         
        System.out.println(namesList);
namesList.remove("nivedita");
 System.out.println(namesList);
 namesList.remove("alex");
 System.out.println(namesList);
 }
}
