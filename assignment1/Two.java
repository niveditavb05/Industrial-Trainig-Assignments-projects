public class Two
{
public static void main(String args[])
{
int i,j,k,l;
for(i=1;i<=5;i++)
{
for(j=5;j>i;j--)
{
System.out.print(" ");
}
for(k=i;k>=1;k--)
{
System.out.print(+k);
}
for(l=2;l<=i;l++)
{
System.out.print(+l);
}
System.out.println();
}
}
}