import java.util.Scanner;

public class shop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the quantity purchased: ");
        int quantity = scanner.nextInt();

      
        int costPerUnit = 100;

       
        int totalCost = quantity * costPerUnit;

        
        if (totalCost > 1000) {
            double discount = 0.10 * totalCost; 
            totalCost -= discount;
            System.out.println("You've received a 10% discount!");
        }

     
        System.out.println("Total cost for " + quantity + " units: " + totalCost);

        
    }
}
    

