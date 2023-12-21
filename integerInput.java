import java.util.Scanner;

public class integerInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int positiveCount = 0;
        int negativeCount = 0;
        int oddCount = 0;
        int evenCount = 0;
        int zeroCount = 0;

        System.out.println("Enter 20 integers:");

        for (int i = 0; i < 20; i++) {
            int num = scanner.nextInt();

            
            if (num > 0) {
                positiveCount++;
            } else if (num < 0) {
                negativeCount++;
            }

            if (num % 2 == 0 && num != 0) {
                evenCount++;
            } else if (num % 2 != 0) {
                oddCount++;
            }

            if (num == 0) {
                zeroCount++;
            }
        }

      
        System.out.println("Number of positive numbers: " + positiveCount);
        System.out.println("Number of negative numbers: " + negativeCount);
        System.out.println("Number of odd numbers: " + oddCount);
        System.out.println("Number of even numbers: " + evenCount);
        System.out.println("Number of zeros: " + zeroCount);

        
    }
}
