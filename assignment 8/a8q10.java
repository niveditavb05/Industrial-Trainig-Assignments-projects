public class a8q10 extends Thread {
   public void run() {
      for (int i = 0; i < 5; i++) {
         System.out.println("The Thread name is " + Thread.currentThread().getName());
      }
   }
   public static void main(String[] args) {
      a8q10  t1 = new a8q10 ();
      t1.setName("Main Thread");
      t1.start();
      Thread t2 = currentThread();
      t2.setName("Current Thread");
      for (int i = 0; i < 5; i++) {
         System.out.println("The Thread name is " + t1.currentThread().getName());
      }
   }
}