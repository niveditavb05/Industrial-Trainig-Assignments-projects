import java.util.HashMap;

class map15
{
    public static void main(String[] args) 
{

        HashMap<String, Integer> numbers = new HashMap<>();
        numbers.put("One", 1);
        numbers.put("Two", 2);
        numbers.put("Three", 3);
        System.out.println("HashMap: " + numbers);
        int value1 = numbers.get("Three");
        System.out.println("Returned Number: " + value1);
        int value2 = numbers.getOrDefault("Five", 5);
        System.out.println("Returned Number: " + value2);
    }
}