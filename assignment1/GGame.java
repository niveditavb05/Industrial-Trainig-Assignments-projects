import java.util.Scanner;

public class GGame
{
public static void main(String [] args)
{
Scanner kb = new Scanner(System.in);
int num = 45;
int guess = 0;
int count = 0;
int guesses = 0;

do
{
System.out.println("Guess what number I have (1-100)? ");
guess = kb.nextInt();
guesses ++;

if(num > guess) {
System.out.println("Too low, try again.");
} else if(num < guess) {
System.out.println("Too high, try again.");
} else {
System.out.println("You're right, the number is" + num);
System.out.println("You guessed" + guesses + "times");
}
}
while(guess!=num);
}
}
