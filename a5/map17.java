import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

class map17
{
    public static void main(String[] args) 
{
        HashMap<String, Integer> numbers = new HashMap<>();
        numbers.put("One", 1);
        numbers.put("Two", 2);
        numbers.put("Three", 3);
        System.out.println("HashMap: " + numbers);

        Iterator<Entry<String, Integer>> iterate1 = numbers.entrySet().iterator();

        System.out.print("Entries: ");
        while(iterate1.hasNext()) {
            System.out.print(iterate1.next());
            System.out.print(", ");
        }

        Iterator<String> iterate2 = numbers.keySet().iterator();
        System.out.print("\nKeys: ");
        while(iterate2.hasNext()) {
            System.out.print(iterate2.next());
            System.out.print(", ");
        }

 
        Iterator<Integer> iterate3 = numbers.values().iterator();
         System.out.print("\nValues: ");
        while(iterate3.hasNext()) {
            System.out.print(iterate3.next());
            System.out.print(", ");
        }
    }
}