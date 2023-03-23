class Quadrilateral {

}

class Trapezoid extends Quadrilateral {
    public int getArea(int base1, int base2, int height) {
        return ((base1 + base2) / 2) * height;
    }
}

class Parallelogram extends Quadrilateral {
    public int getArea(int base, int height) {
        return base * height;
    }
}

class Rectangle extends Quadrilateral {
    public int getArea(int length, int width) {
        return length * width;
    }
}

class Square extends Quadrilateral {
    public int getArea(int side) {
        return side * side;
    }
}

public class Problem1 {
    public static void main(String[] args) {
        Trapezoid trapezoid = new Trapezoid();
        Parallelogram parallelogram = new Parallelogram();
        Rectangle rectangle = new Rectangle();
        Square square = new Square();
        System.out.println("Area of Trapezoid: "+trapezoid.getArea(10, 20, 30));
        System.out.println("Area of Parallelogram: "+parallelogram.getArea(10, 20));
        System.out.println("Area of Rectangle: "+rectangle.getArea(10, 20));
        System.out.println("Area of Square: "+square.getArea(10));
    }
}