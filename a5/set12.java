import java.util.*;

public class set12 {
    public static void main(String[] args) 
{
       HashSet <String> hs = new HashSet <String> ();
        HashSet <String> clone_set = new HashSet <String> ();
        hs.add("C");
        hs.add("C++");
        hs.add("JAVA");
        hs.add("PHP");
        hs.add("SFDC");
        System.out.println("HashSet: " + hs);
        System.out.println("Clone HashSet: " + clone_set);
        clone_set = (HashSet) hs.clone();
        System.out.println("hs.clone(): " + clone_set);
    }
}