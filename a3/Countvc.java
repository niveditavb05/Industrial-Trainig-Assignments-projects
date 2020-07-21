public class Countvc
 {

    public static void main(String[] args) 
{
        String str = "java";
        int vowels = 0, consonants = 0;

        str= str.toLowerCase();
        for(int i = 0; i < str.length(); ++i)
        {
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i'
                || ch == 'o' || ch == 'u') {
                ++vowels;
            }
            else  {
                ++consonants;
            }
            
        }

        System.out.println( + vowels + "   Vowels: ");
        System.out.println(+ consonants + "   Consonants: " );
       
    }
}