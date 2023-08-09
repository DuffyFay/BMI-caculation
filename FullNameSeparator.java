import java.util.Scanner;

public class Main{
    public static void FullNameSeparator(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your First Name and Last name sperate with a space: ");
        String name = scanner.nextLine();

        int k = name.indexOf(' ');
        
        String firstName = name.substring(0, k);
        String lastName = name.substring(k + 1);

        System.out.println("First name: " + firstName + "\nLast Name: " + lastName);
    }
}
