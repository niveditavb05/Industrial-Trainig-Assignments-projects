import java.util.HashMap;

class map16
{
    public static void main(String[] args) 
{

        HashMap<String, Integer> numbers = new HashMap<>();
        numbers.put("First", 1);
        numbers.put("Second", 2);
        System.out.println("Original HashMap: " + numbers);
        numbers.merge("First", 4, (oldValue, newValue) -> oldValue + newValue);
        System.out.println("New HashMap: " + numbers);
    }
}