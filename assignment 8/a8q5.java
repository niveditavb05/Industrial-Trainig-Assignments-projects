class a8q5 extends Thread{  
 public void run(){  
   System.out.println("Task one");
   for(int i=1;i<11;i++)
    {
     System.out.println(i);
    }
   System.out.println("Task two");
   for(int j=11;j<21;j++)
     {
      System.out.println(j);
     }
   System.out.println("Task three");
   for(int k=21;k<31;k++)
      {
    System.out.println(k);
      }
 }  
 public static void main(String args[]){  
  a8q5 t1=new a8q5();  
  
  t1.start();  
  
 }  
}