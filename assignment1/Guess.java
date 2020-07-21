import java.util.Scanner;        
import java.util.Random;         
import javax.swing.JOptionPane; 
public class Guess
{
    public static void main(String[] args)
    {
        int rnumber;
        Random randomNumbers = new Random();
        rnumber = randomNumbers.nextInt(1000) + 1; 
        String answer;
        int guess; 
        answer = JOptionPane.showInputDialog("Enter a whole  " +
            "number between 1 and 1000.");
        guess = Integer.parseInt(answer);
        int guesses;
        guesses = 0;                                                          
        while (guess != rnumber);
        {                                   
            if (guess > rnumber)
            {
                JOptionPane.showMessageDialog(null,"Too high, try again.");
                guess = Integer.parseInt(answer);
                guesses++;
            }            
            if (guess < rnumber)
            {                         
                JOptionPane.showMessageDialog(null,"Too low, try again.");
                guesses++;
            }  
        }       
        while (guess == rnumber)
        {                
            guesses++;
            JOptionPane.showMessageDialog(null,"Congratulations! The correct " +
                "number is " + rnumber + ",and you had" + guesses + "guesses.");

        }

    System.exit(0);
    }  
}