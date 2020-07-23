import java.util.*;
class Distance
{
 int feet;
 int inches;
public void getDistance()
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter feet: ");
feet=sc.nextInt();
System.out.print("Enter inches: ");
inches=sc.nextInt();
}
public void showDistance()
{
System.out.println("Feet: "+ feet + "\tInches: "+ inches);
}
public void addDistance(Distance D1, Distance D2)
{
inches=D1.inches+D2.inches;
feet=D1.feet+D2.feet+(inches/12);
inches=inches%12;
}
}
public class a2q11
{
public static void main(String []s)
{
try
{
Distance D1=new Distance();
Distance D2=new Distance();
Distance D3=new Distance();
System.out.println("Enter first distance: ");
D1.getDistance();
System.out.println("Enter second distance: ");
D2.getDistance();
D3.addDistance(D1,D2);
System.out.println("Total distance is:" );
D3.showDistance();
}
catch (Exception e)
{
System.out.println("Exception occurred :"+ e.toString());
}
}
}
