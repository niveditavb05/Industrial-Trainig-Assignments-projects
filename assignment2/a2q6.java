class area{
int length;
int breadth;
public void setDim(int p,int q)
{
length=p;
breadth=q;
}
public int getArea(){
return length*breadth;
}
}
class a2q6{
public static void main(String[] args){
area a = new area();
int p,q;
p=Integer.parseInt(args[0]);
q=Integer.parseInt(args[1]);
a.setDim(p,q);
System.out.println("Area : "+a.getArea());
}
}	
