import java.util.Scanner;

public class Lottery{
    public static void main(String[] args){
        int lottery = (int) (Math.random() * 100);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your guess: ");
        int guess = scanner.nextInt();

        int lotteryDigit1 = lottery / 10;
        int lotteryDigit2 = lottery % 10;

        int guessDigit1 = guess / 10;
        int guessDigit2 = guess % 10;

        if ( guess == lottery) {
            System.out.println("Lottery Number is: " + lottery);
            System.out.println(" Your are big winner! You win €10,000" );
        }
        else if ( guessDigit1 == lotteryDigit2 && guessDigit2 == lotteryDigit1) {
            System.out.println("Lottery Number is: " + lottery);
            System.out.println("You are winner! You win €3,000");
        }
        else if ( guessDigit1 == lotteryDigit1 || guessDigit1 == lotteryDigit1 || guessDigit2 == lotteryDigit1 || guessDigit2 == lotteryDigit2) {
            System.out.println("Lottery Number is: " + lottery);
            System.out.println("You are winner! You win €1,000");
        }
        else{
            System.out.println("Lottery Number is: " + lottery);
            System.out.println("Sorry, please try again");
        }
    }
}
