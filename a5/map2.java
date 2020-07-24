import java.util.HashMap;
import java.util.Map;
public class map2
{
public static void main(String[] args) 
{
Map<String, String> newHashMap = new HashMap<>();
newHashMap.put("Key1", "nivu");
newHashMap.put("Key2", "priti");
newHashMap.put("Key3", "shruti");
newHashMap.putIfAbsent("Key4", "gayii");
System.out.println(newHashMap);
}
}