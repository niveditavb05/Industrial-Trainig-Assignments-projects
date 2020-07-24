import java.util.*;
public class link11 
{
    public static void main(String[] args) 
    {
        LinkedList<String> namesList = new LinkedList<String>(Arrays.asList( "alex", "brian", "charles", "alex") );
         
        System.out.println(namesList);
namesList.remove("nivedita");
 System.out.println(namesList);
 namesList.remove("alex");
 System.out.println(namesList);
 }
}
