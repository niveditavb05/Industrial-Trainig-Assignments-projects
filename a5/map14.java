import java.util.HashMap;

class map14
{
    public static void main(String[] args) 
{
        HashMap<String, Integer> numbers = new HashMap<>();

        numbers.put("One", 1);
        numbers.put("Two", 2);
        numbers.put("Three", 3);
        System.out.println("HashMap: " + numbers);
        System.out.println("Key/Value mappings: " + numbers.entrySet());
        System.out.println("Keys: " + numbers.keySet());
        System.out.println("Values: " + numbers.values());
    }
}