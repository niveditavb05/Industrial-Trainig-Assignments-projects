import java.io.*;
public class file2
{
public static void main(String[] args)throws IOException
{

try
{
    FileInputStream fstream = new FileInputStream("test.txt");
    DataInputStream in = new DataInputStream(fstream);
    BufferedReader br = new BufferedReader(new InputStreamReader(in));

    FileWriter ostream = new FileWriter("vowels.txt");
      BufferedWriter out = new BufferedWriter(ostream);
      FileWriter opstream = new FileWriter("consonants.txt");
      BufferedWriter outt = new BufferedWriter(opstream); 

     String str=br.readLine();
     char ch;        
     for (int i=0;i<str.length();i++)
     {
         ch = str.charAt(i); 


      if(( ch == 'a') ||( ch == 'e') ||( ch == 'i') ||( ch == 'o') ||( ch == 'u')) 

    {
        out.write(ch);
    }
          else
          {
              outt.write(ch); 
          }

      }

     out.close();
      outt.close();
      br.close(); 
FileReader reader = new FileReader("consonants.txt");
            BufferedReader bufferedReader = new BufferedReader(reader);
 
            String line;
while ((line = bufferedReader.readLine()) != null) {
                System.out.println("consonants = ");
 System.out.println(line);
            }
FileReader rea = new FileReader("vowels.txt");
            BufferedReader bufferedRea = new BufferedReader(rea);
 
            String li;
while ((li = bufferedRea.readLine()) != null) {
                System.out.println("consonants = ");
 System.out.println(li);
            }

}
catch (Exception e) {
    System.err.println(e);
  }

    }

}