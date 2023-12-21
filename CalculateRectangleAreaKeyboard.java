import java.util.Scanner;

class Area {
    private int length;
    private int breadth;

    
    public Area(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }


    public int returnArea() {
        return length * breadth;
    }
}

public class CalculateRectangleAreaKeyboard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

   
        System.out.print("Enter length of the rectangle: ");
        int length = scanner.nextInt();

        System.out.print("Enter breadth of the rectangle: ");
        int breadth = scanner.nextInt();

     
        Area rectangle = new Area(length, breadth);

     
        int area = rectangle.returnArea();
        System.out.println("Area of the rectangle: " + area);

        scanner.close();
    }
}
