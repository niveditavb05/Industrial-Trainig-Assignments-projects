import java.util.*;
public class remobj 
{
    public static void main(String[] args) 
    {
        ArrayList<String> namesList = new ArrayList<String>(Arrays.asList( "alex", "brian", "charles", "alex") );
         
        System.out.println(namesList);
namesList.remove("nivedita");
 System.out.println(namesList);
 namesList.remove("alex");
 System.out.println(namesList);
 }
}
