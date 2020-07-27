import java.io.*;
public class a8q9 extends Thread  
{  
  public void run()  
    {    
    System.out.println("First thread running...");    
    }    
    public static void main(String args[]) throws InterruptedException 
    {    
		a8q9 t1=new a8q9();  
Thread t=new Thread(t1);

          
        t.start();    
    
        t.run(); 
}   
    
}    