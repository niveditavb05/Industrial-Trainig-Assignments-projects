import java.security.SecureRandom;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
class Account {
    int balance=0;

    public String deposit(int money){
        balance += money;
        return "Depositing"+money;
    }

    public String withdraw(int money){
        if(balance<money){
            return "Withdraw"+money+" (Insufficient Balance)";
        } else{
        balance -= money;
            return "Withdraw"+money;
        }
    }
     public int getBalance(){
        return balance;
    }
}

class Transaction {
    Account account = new Account();
    List<String> transactions = new ArrayList<>();

    public Transaction(Account account){
        this.account = account;
    }
public void deposit(int money){
        transactions.add(account.deposit(money));
    }

    public void withdraw(int money){
        transactions.add(account.withdraw(money));
    }

    public List<String> getTransaction(){
        return transactions;
    }
}
class TransactionRunnable implements Runnable {
    private static final SecureRandom RANDOM_GENERATOR = new SecureRandom();
    private final Transaction transaction;
    private final int transactionsCount;
    
    public TransactionRunnable(Transaction transaction, int transactionsCount) {
        this.transaction = transaction;
        this.transactionsCount = transactionsCount;
    }
    public void run() {
        for (int i = 0; i < this.transactionsCount; i++) {
            int transactionType = RANDOM_GENERATOR.nextInt() % 2;
            int money = RANDOM_GENERATOR.nextInt(100) + 1;

            if (transactionType == 0) {
                this.transaction.deposit(money);
             } else {
                this.transaction.withdraw(money);
            }
        }
    }
}

public class a8q1 {
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final Account ACCOUNT = new Account();
    private static final Transaction TRANSACTION = new Transaction(ACCOUNT);
    
    public static void main(String[] args) throws InterruptedException {
        int threadsCount = Integer.parseInt(SCANNER.nextLine());
        Thread[] threads = new Thread[threadsCount];
         int expectedTransactionsCount = 0;
        for (int i = 0; i < threadsCount; i++) {
            int transactionsCount = Integer.parseInt(SCANNER.nextLine());
            expectedTransactionsCount += transactionsCount;
            
            threads[i] = new Thread(new TransactionRunnable(TRANSACTION, transactionsCount));
        }
        
        for (int i = 0; i < threadsCount; i++) {
            threads[i].start();
        }
        
        for (int i = 0; i < threadsCount; i++) {
            threads[i].join();
        }
        
        List<String> transactions = TRANSACTION.getTransaction();
          if (transactions.size() != expectedTransactionsCount) {
            System.out.println("Wrong Answer");
        } else {
            boolean correct = true;
            for (String transaction: transactions) {
                if (transaction == null) {
                    correct = false;
                    
                    break;
                }
            }
            
            if (!correct) {
                System.out.println("Wrong Answer");
            } else {
                int balance = ACCOUNT.getBalance();
             if (balance < 0) {
                    System.out.println("Wrong Answer");
                } else {
                    for (String transaction: transactions) {
                        System.out.println(transaction);
                    }

                    System.out.println("Balance " + balance);
                }
            }
        }
    }
}