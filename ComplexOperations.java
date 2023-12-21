import java.util.Scanner;

class Complex {
    private double real;
    private double imaginary;

    // Constructor to initialize the complex number with real and imaginary parts
    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Method to perform addition of two complex numbers
    public Complex add(Complex other) {
        double sumReal = this.real + other.real;
        double sumImaginary = this.imaginary + other.imaginary;
        return new Complex(sumReal, sumImaginary);
    }

    // Method to perform subtraction of two complex numbers
    public Complex subtract(Complex other) {
        double diffReal = this.real - other.real;
        double diffImaginary = this.imaginary - other.imaginary;
        return new Complex(diffReal, diffImaginary);
    }

    // Method to perform multiplication of two complex numbers
    public Complex multiply(Complex other) {
        double productReal = this.real * other.real - this.imaginary * other.imaginary;
        double productImaginary = this.real * other.imaginary + this.imaginary * other.real;
        return new Complex(productReal, productImaginary);
    }

    // Method to display the complex number
    public void display() {
        System.out.println("Complex Number: " + this.real + " + " + this.imaginary + "i");
    }
}

public class ComplexOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the real and imaginary parts of the first complex number:");
        System.out.print("Real part: ");
        double real1 = scanner.nextDouble();
        System.out.print("Imaginary part: ");
        double imaginary1 = scanner.nextDouble();

        System.out.println("\nEnter the real and imaginary parts of the second complex number:");
        System.out.print("Real part: ");
        double real2 = scanner.nextDouble();
        System.out.print("Imaginary part: ");
        double imaginary2 = scanner.nextDouble();

        Complex complex1 = new Complex(real1, imaginary1);
        Complex complex2 = new Complex(real2, imaginary2);

        // Performing operations
        Complex sum = complex1.add(complex2);
        Complex difference = complex1.subtract(complex2);
        Complex product = complex1.multiply(complex2);

        // Displaying the results
        System.out.println("\nSum of the two complex numbers:");
        sum.display();

        System.out.println("\nDifference of the two complex numbers:");
        difference.display();

        System.out.println("\nProduct of the two complex numbers:");
        product.display();

        scanner.close();
    }
}
