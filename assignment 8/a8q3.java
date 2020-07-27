class A extends Thread { 
  
    
    public void run() 
    { 
        for (int i = 1; i <= 4; i++) { 
            try { 
                wait(); 
            } 
            catch (Exception e) { 
                System.out.println(e); 
            } 
            System.out.print(i + " "); 
        } 
    } 
} 
class B extends Thread { 
  
    
    public void run() 
    {   System.out.println(Thread.currentThread().getName() + " in control"); 
        for (char i = 'a'; i <= 'd'; i++) { 
            try { 
                Thread.sleep(100); 
            } 
            catch (Exception e) { 
                System.out.println(e); 
            } 
            System.out.print(i + " ");
            
          
        } 
    } 
} 
class a8q3 extends Thread { 
  
    public static void main(String args[]) 
    { 
        // creating two threads 
        A a1 = new A(); 
        B b1 = new B(); 
  
        // starts second thread after when 
        // first thread a1 is died. 
        a1.start(); 
        a1.setPriority(5);
        System.out.println(a1.isAlive()); 
        b1.start();
        try { 
            a1.join(); 
        } 
        catch (Exception e) { 
            System.out.println(e); 
        } 
  
       
    } 
} 