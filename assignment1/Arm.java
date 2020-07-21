
public class Arm
{
public static void main(String args[])
{
int num,temp,rem=0,sum=0,i, cube;
num=1;
temp=1;
for(i=1;i<500;i++)
{
while(num!=0)
{
rem=num%10;
cube=(rem*rem*rem);
sum=sum+cube;
num=num/10;
}

if(sum==temp)
System.out.println(+temp);
rem=0;
sum=0;
cube=0;
temp=i+1;
num=i+1;
}
}
}
