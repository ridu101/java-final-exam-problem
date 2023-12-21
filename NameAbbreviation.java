import java.util.Scanner;

public class NameAbbreviation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your full name: ");
        String fullName = scanner.nextLine();

        String[] names = fullName.split("\\s+"); // Split the full name into individual names

        StringBuilder abbreviation = new StringBuilder();

        // Process the names to get abbreviations
        for (int i = 0; i < names.length; i++) {
            if (i == names.length - 1) {
                // Last name remains unchanged
                abbreviation.append(names[i]);
            } else {
                
                abbreviation.append(names[i].charAt(0)).append(".");
            }
        }

        System.out.println("Abbreviated name: " + abbreviation.toString());

        scanner.close();
    }
}
