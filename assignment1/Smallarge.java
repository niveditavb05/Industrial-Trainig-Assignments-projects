import java.util.*;
public class Smallarge
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n;
int max=Integer.MIN_VALUE;
int min=Integer.MAX_VALUE;
char ch;
do{
System.out.println("enter the number=");
n=sc.nextInt();
if(n>max)
{
max=n;
}
else
{
min=n;
}
System.out.println("do you want to continue.. y/n ?");
ch=sc.next().charAt(0);
}while(ch=='y' || ch=='Y');
System.out.println("largest number="+max);
System.out.println("smallest number="+min);
}
}