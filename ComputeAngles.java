import java.util.Scanner;

public class Main{
    public static void ComputeAngles(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter three points: ");
        System.out.println("x1: ");
        double x1 = scanner.nextDouble();
        System.out.println("y1: ");
        double y1 = scanner.nextDouble();
        System.out.println("x2: ");
        double x2 = scanner.nextDouble();
        System.out.println("y2: ");
        double y2 = scanner.nextDouble();
        System.out.println("x3: ");
        double x3 = scanner.nextDouble();
        System.out.println("y3: ");
        double y3 = scanner.nextDouble();

        double a = Math.sqrt( Math.pow((x2-x3),2) + Math.pow( (y2-y3),2) );
        System.out.println("length of a: " + a);
        double b = Math.sqrt( Math.pow((x1-x3),2) + Math.pow( (y1-y3),2) );
        System.out.println("length of b: " + b);
        double c = Math.sqrt( Math.pow((x1-x2),2) + Math.pow( (y1-y2),2) );
        System.out.println("length of c: " + c);

        double A = Math.toDegrees(Math.acos( (a*a - b*b - c*c) / (-2 * b*c) ));
        System.out.println("Degree A: " + A);

        double B = Math.toDegrees(Math.acos((b*b - a*a - c*c) / (-2 * a*c) ));
        System.out.println("Degree B: " + B);
        double C = Math.toDegrees(Math.acos((c*c - b*b - a*a) / (-2 * a*b) ));
        System.out.println("Degree C: " + C);

        System.out.println("The three angles are " +
                Math.round( A*100 /100.0 ) + " " +
                Math.round( B*100 /100.0 ) + " " +
                Math.round( C*100 /100.0 ) + " ");

    }
}
