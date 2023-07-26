import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Your height in inch: ");
        double height = scanner.nextDouble() * 0.0254;
        System.out.println("Your weight in pound: ");

        double weight = scanner.nextDouble() * 0.45359237;
        double bmi = weight / Math.pow(height, 2);

        System.out.println("Your BMI is " + bmi);

        if (bmi < 18.5) {
            System.out.println("Underweight");
        }
        else if ( bmi >= 18.5 || bmi < 25.0) {
            System.out.println("Normal");
        }
        else if ( bmi >= 25.0 || bmi < 30.0) {
            System.out.println("Overweight");
        }
        else if( bmi >= 30.0) {
            System.out.println("Obese");
        }
    }
}
