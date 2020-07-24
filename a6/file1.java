import java.io.*;
class file1
{
static final int MAX_CHAR=256;
static int countChar(String str)
{
int count5[]=new int[MAX_CHAR];
int len=str.length();
for(int i2=0;i2<len;i2++)
count5[str.charAt(i2)]++;
char chz[]=new char[str.length()];
for(int i2=0;i2<len;i2++)
{
chz[i2]=str.charAt(i2);
int find=0;
for(int j2=0;j2<=i2;j2++)
{
if(str.charAt(i2)==chz[j2])
find++;
}
if(find==1)
System.out.println("number of occurrence of " + str.charAt(i2) + "  is :" +count5[str.charAt(i2)]);
}
return 0;
}

public static void main(String args[])
{
try{

String str="File handling in Java using FileWriter and FileReader Java FileWriter and FileReader classes are used to write and read data from text files (they are Character Stream classes). It is recommended not to use the FileInputStream and FileOutputStream classes if you have to read and write any textual information as these are Byte stream classes.";
         
FileWriter fw=new FileWriter("test.txt");
for(int i=0;i<str.length();i++)
fw.write(str.charAt(i));
System.out.print("writting successful ");
System.out.println();
fw.close();
int ch;
FileReader fr=null;
try
{
fr=new FileReader("test.txt");
}
catch (FileNotFoundException fe)
{
System.out.println("file not found");
}
int vowels=0,consonants=0,p=0;
while((ch=fr.read())!=-1)
{
System.out.print((char)ch);
}
System.out.println();
System.out.println();
int count=0,count1=0;
char ch1;
str=str.toLowerCase();
for(int k=0;k<str.length();k++)
{
if(str.charAt(k) !=' ')
{
count++;
}
if(str.charAt(k) =='a' || str.charAt(k) =='e' || str.charAt(k) =='i' || str.charAt(k) =='o' || str.charAt(k) =='u')
{
vowels++;
}
else
{
consonants++;
}
}
char ch2[]=new char[str.length()];
for(int f=0;f<str.length();f++)
{
ch2[f]=str.charAt(f);
if( ((f>0) && (ch2[f]!=' ') && (ch2[f-1]==' ')) || ((ch2[0]!=' ') && (f==0)) )
count1++;
}
System.out.println("number of letters in a file : " +count);
System.out.println("number of  vowels in a file : " +vowels);
System.out.println("number of consonants in a file : " +consonants);
System.out.println("number of words in a file : " +count1);
countChar(str);
fr.close();
}
catch (IOException e) {
            e.printStackTrace();
        }
}
}
