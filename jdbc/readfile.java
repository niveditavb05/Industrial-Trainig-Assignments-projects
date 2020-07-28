import java.io.*;

class readfile
{
public static void main(String[] args) throws IOException {

    String str="tom       101  500   95nivedita  7    500   96priti     8    456   97shruti    4    566   98prathm    9    566   98gayatri   3    455   78vaibhavi  7    566   90sneha     1    455   76vaishnavi 9    444   75mahesh    12   766   76 ";
         File file=new File("read.txt");
FileWriter fw=new FileWriter("read.txt");
for(int i=0;i<str.length();i++)
fw.write(str.charAt(i));
System.out.print("writting successful ");
System.out.println();
fw.close();
int ch;
FileReader fr=null;
try
{
fr=new FileReader("read.txt");
}
catch (FileNotFoundException fe)
{
System.out.println("file not found");
}
    
}
}