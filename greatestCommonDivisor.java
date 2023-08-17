import java.util.Scanner;

public class greatestCommonDivisor{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("First integer: ");
        int n1 = scanner.nextInt();
        System.out.println("Second integer: ");
        int n2 = scanner.nextInt();

        int gcd = 1; //Initial gcd is 1
        int k = 2; //Possible gcd

        while ( k <= n1 && k <= n2) {
            if ( n1 % k == 0 && n2 % k == 0)
                gcd = k;
            k++;
        }

        System.out.println("The grestest common divisor: " + gcd);
    }
}
