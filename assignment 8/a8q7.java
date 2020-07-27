import java.util.logging.Level;
import java.util.logging.Logger;

 class One extends Thread {

    PrintNumbers p;
    int i = 1;

    public One(PrintNumbers p) {
        this.p = p;
    }

    @Override
    public void run() {

        int prev = 1;
        while (prev < 1111) {
            p.printOne(prev);
            prev = (int) (prev +  Math.pow(10, i));
            i = i + 1;
        }

    }
}
 class Two extends Thread {

    int i = 1;

    PrintNumbers p;

    public Two(PrintNumbers p) {
        this.p = p;

    }

   
    public void run() {

        int prev = 2;
        while (prev < 2222) {
            p.printTwo(prev);
            prev = (int) (prev + 2 * Math.pow(10, i));
            i = i + 1;
        }
}
}
 class Three extends Thread {

    PrintNumbers p;
    int i = 1;

    public Three(PrintNumbers p) {
        this.p = p;
    }

    @Override
    public void run() {

        int prev = 3;
        while (prev < 3333) {
            p.printThree(prev);
            prev = (int) (prev + 3 * Math.pow(10, i));
            i = i + 1;
}
}
}
 class PrintNumbers {

    public enum status {
        A, B, C
    }
    status Y=status.B;
    status X = status.A;
    //
    public synchronized void printOne(int number) {
        //
        if (!X.equals(status.A) && !Y.equals(status.B)) {

            try {
                wait();

            } catch (InterruptedException ex) {
                Logger.getLogger(PrintNumbers.class.getName()).log(
                        Level.SEVERE, null, ex);
            }
        }
        System.out.println(Thread.currentThread().getName() + number);
        X = status.B;
       notifyAll();

    }

    public synchronized void printTwo(int number) {
        //
        if (!X.equals(status.B) && !Y.equals(status.C)) {

            try {
                // System.out.println("under wait even");
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(PrintNumbers.class.getName()).log(
                        Level.SEVERE, null, ex);
            }
        }
        System.out.println(Thread.currentThread().getName() + number);
        X = status.C;
notifyAll();

    }

    public synchronized void printThree(int number) {
        //
         if (!X.equals(status.C) && !Y.equals(status.A)) {

            try {
                // System.out.println("under wait even");
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(PrintNumbers.class.getName()).log(
                        Level.SEVERE, null, ex);
            }
        }
        System.out.println(Thread.currentThread().getName() + number);
        X = status.A;
    notifyAll();

    }
   
}
 class a8q7 {

    public static void main(String[] args) {

        PrintNumbers b = new PrintNumbers();

        One firstThread = new One(b);
        Two secondThread = new Two(b);
        Three thirdThread = new Three(b);

        secondThread.setName("second: ");
        thirdThread.setName("third: ");
        firstThread.setName("first: ");

        firstThread.start();
        secondThread.start();
        thirdThread.start();
    }
}