import java.util.Scanner;

public class LowestTermsFraction {
    // Function to find the greatest common divisor (GCD) using Euclidean algorithm
    public static int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return findGCD(b, a % b);
        }
    }

    // Function to simplify the fraction to its lowest terms
    public static void simplifyFraction(int numerator, int denominator) {
        int gcd = findGCD(numerator, denominator);
        int simplifiedNumerator = numerator / gcd;
        int simplifiedDenominator = denominator / gcd;

        System.out.println("The fraction in lowest terms is: " + simplifiedNumerator + "/" + simplifiedDenominator);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the numerator: ");
        int numerator = scanner.nextInt();

        System.out.print("Enter the denominator: ");
        int denominator = scanner.nextInt();

        if (denominator == 0) {
            System.out.println("Denominator cannot be zero. Please enter a non-zero value.");
        } else {
            simplifyFraction(numerator, denominator);
        }

        scanner.close();
    }
}
