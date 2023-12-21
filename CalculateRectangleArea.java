class Rectangle {
    private int length;
    private int breadth;

   
    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

  
    public int calculateArea() {
        return length * breadth;
    }
}

public class CalculateRectangleArea {
    public static void main(String[] args) {
        
        Rectangle rectangle1 = new Rectangle(4, 5);
        Rectangle rectangle2 = new Rectangle(5, 8);

    
        int area1 = rectangle1.calculateArea();
        int area2 = rectangle2.calculateArea();

       
        System.out.println("Area of Rectangle 1 (4x5): " + area1);
        System.out.println("Area of Rectangle 2 (5x8): " + area2);
    }
}
