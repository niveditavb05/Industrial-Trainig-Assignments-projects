import java.util.*;
public class Count
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n,countp=0,countn=0,countz=0;
char ch;
do
{
System.out.println("enter the number=");
n=sc.nextInt();
if(n>0)
{
countp++;
}
else if(n<0)
{
countn++;
}
else
{
countz++;
}
System.out.println("do you want to continue y/n ?");
ch=sc.next().charAt(0);
}while(ch=='y' || ch=='Y');
System.out.println("positive numbers="+countp);
System.out.println("negative numbers="+countn);
System.out.println("zero numbers="+countz);
}
}
