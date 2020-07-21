public class Number
{
public static void main(String args[])
{
final static Random rand = new Random();
final int MAXNUMBER=10;
int getRandomNumber();
{
return rand.nextInt(MAX_NUMBER);
}
int userguess;
int randomNumber;
int numberOfGuesses;
Scanner sc=new Scanner(System.in);
System.out.println("i'm thinking of a number .");
System.out.println("Guess what it is :");
userGuess=sc.nextInt();
numberOfGuesses=1;
randomNumber=getRandomNumber();
while(userGuess ! = randomNumber)
{
if(userGuess < randomNumber)
{
System.out.println("No,that's too iow..");
}
else if(userGuess > randomNumber)
{
System.out.println("Sorry , that's too  high");
}
System.out.println("Guess again:");
userGuess=sc.nextInt();
numberOfGuesses++;
}
System.out.println("Congratulations ! you guessed it !");
System.out.println("i was thinking of the number "+randomNumber +".");
System.out.println("you got it right in " +numberOfGuesses +"guesses.");
}
}

