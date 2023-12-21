import java.util.Scanner;

public class reverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter a 4-digit number: ");
        int number = scanner.nextInt();

      
        if (number < 1000 || number > 9999) {
            System.out.println("Please enter a valid 4-digit number.");
        } else {
            int reversedNumber = 0;

            while (number != 0) {
                int digit = number % 10;
                reversedNumber = reversedNumber * 10 + digit;
                number /= 10;
            }

          
            System.out.println("The reversed number is: " + reversedNumber);
        }

    }
}
