import java.util.Scanner;

public class LeapYear{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter year: ");
        int year = scanner.nextInt();

        boolean leapYear = ( (year % 4 == 0) && (year % 100 != 0) ) || ( year % 400 == 0);
        System.out.println("Leap year? " + leapYear);
    }
}
