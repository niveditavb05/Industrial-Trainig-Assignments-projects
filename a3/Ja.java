import java.util.Scanner;

public class Ja {
static class MyStrings {
    String s;

void setMyStrings(String str) {
    s = str;    
}

int getMode() {
        int i;
        int j;
        int count = 0;
        int maxMode = 0, maxCount = 1;
        for (i = 0; i< s.length(); i++) {
            maxCount = count;
            count = 0;
            for (j = s.length()-1; j >= 0; j--) {
                if (s.charAt(j) == s.charAt(i))
                    count++;
                if (count > maxCount){
                    maxCount = count;
                    maxMode = i;
                }
            }       
        }
        
      return maxMode;  
}

    String removeDup() {
       getMode();
       int i;
       int j;
       String rdup = "";

       for (i = 0; i< s.length(); i++) {
           int count = 1;
           for (j = 0; j < rdup.length(); j++) {
               if (s.charAt(i) == s.charAt(j)){
                    count++;
               }
           }
           if (count == 1){
               rdup += s.charAt(i);
               }
           } 
System.out.println("After removing duplicate characters from String = ");
           System.out.print(       rdup);
           System.out.println();
           return rdup;
       }


}

public static void main (String[] args) {
Scanner in = new Scanner(System.in);
MyStrings setS = new MyStrings();

    String s;

            System.out.print("Enter string:");
            s = in.nextLine();

            setS.setMyStrings(s);
            setS.getMode();
            setS.removeDup();


}

}