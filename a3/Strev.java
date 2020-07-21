import java.io.FileNotFoundException;
import java.io.IOException;
public class Strev
 {

    public static void main(String args[]) throws FileNotFoundException, IOException 
{
String str = "Sony is going to introduce Internet TV soon";
System.out.println("Original String: " + str);
       

         String   reverseStr = reverse(str);
        System.out.println("Reverse String in Java using Iteration: " + reverseStr);

        
        reverseStr = reverseRecursively(str);
        System.out.println("Reverse String in Java using Recursion: " + reverseStr);

    }

    public static String reverse(String str)
 {
        StringBuilder strBuilder = new StringBuilder();
        char[] strChars = str.toCharArray();

        for (int i = strChars.length - 1; i >= 0; i--)
 {
            strBuilder.append(strChars[i]);
        }

        return strBuilder.toString();
    }

    public static String reverseRecursively(String str) 
{

        if (str.length() < 2) 
{
            return str;
        }

        return reverseRecursively(str.substring(1)) + str.charAt(0);

    }
}
