import java.util.*;
class matrix
{
private double[][] mat;
int row , column;
matrix()
{
row=0;
column=0;
}
matrix(int r, int c)
{
row = r;
column = c;
mat = new double[row][column];
}
public void get_input()
{
Scanner s = new Scanner(System.in);
int i=0,j=0;
System.out.println("Enter the matrix elements(row-wise)");
for (i=0; i < row; i++)
{
for(j=0; j<column; j++)
{
mat[i][j] = s.nextDouble();}
}
}
public void print_matrix()
{
int i = 0, j = 0;
System.out.println("The matrix is:>>");
for (i = 0; i < row; i++)
{
System.out.println("");
for (j = 0; j < column; j++)
{
System.out.print("   "+mat[i][j]);
}
}
}
}
class a2q13
{
private static matrix m1,m2,ans;
public static void main(String args[])
{int i = 0, j = 0,r=0,c=0;
Scanner s = new Scanner(System.in);
System.out.println("Enter no. of rows:");
r = s.nextInt();
System.out.println("Enter no. of columns:");
c = s.nextInt();
System.out.println("Enter the first matrix:>>");
m1 = new matrix(r,c);
m1.get_input();
m1.print_matrix();
}
}
