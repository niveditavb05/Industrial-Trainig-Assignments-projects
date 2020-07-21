public class Maxoccur
{ 

char getMaxOccuringChar(String* str) 
{ 
    
    int count[ASCII_SIZE] = {0}; 
  
    
    int len = strlen(str); 
    int max = 0;  
    String result;   
  
   
    for (int i = 0; i < len; i++) { 
        count[str[i]]++; 
        if (max < count[str[i]]) { 
            max = count[str[i]]; 
            result = str[i]; 
        } 
    } 
  
    return result; 
} 
  public static void main(String args[]) 
{ 
    char str[] = "sample string"; 
    System.out.println( "Max occurring character is = " getMaxOccuringChar(str)); 
} 
}