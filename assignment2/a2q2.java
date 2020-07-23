class student
{
String name;
String address;
long phoneno;
int rollno;
student(String a,String b,long c,int d)
{
name=a;
address=b;
phoneno=c;
rollno=d;
}
}
class a2q2
{
public static void main(String args[])
{
student s1=new student("Sam","Latur",90961424,1);
student s2=new student("John","Pune",93701246,2);
System.out.println("Rollno:"+s1.rollno+"\nNmae:"+s1.name+"\nAddress:"+s1.address+"\nPhone no.:"+s1.phoneno);
System.out.println("Rollno:"+s2.rollno+"\nNmae:"+s2.name+"\nAddress:"+s2.address+"\nPhone no.:"+s2.phoneno);
}
}
