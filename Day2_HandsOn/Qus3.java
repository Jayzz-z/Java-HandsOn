package Day2;

public class Rectangle {
    private double length;
    private double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public void area() {
        System.out.println(breadth * length);
    }

    public void perimeter() {
        System.out.println(2 * (breadth + length));
    }
}


public class Square extends Rectangle {
    public Square(double side) {
        super(side, side);
    }
}


public class Qus3 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 5);
        Rectangle square = new Square(10);
        rectangle.area();
        rectangle.perimeter();
        System.out.println();
        square.area();
        square.perimeter();
    }
}