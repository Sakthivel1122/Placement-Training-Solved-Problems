import java.util.Scanner;

class Rectangle{
    int w,h;
    public void display(){
        System.out.println(w+" "+h);
    }
}
class RectangleArea extends Rectangle{
    int width;
    int height;
    public void read_input(){
        Scanner scan = new Scanner(System.in);
        Rectangle obj = new Rectangle();
        this.width = scan.nextInt();
        this.height = scan.nextInt();
        obj.w = width;
        obj.h = height;
    }
    public void display(){
        System.out.println(width*height);
    }
}
public class Problem1{
    public static void main(String[] args) {
        Rectangle obj1 = new Rectangle();
        RectangleArea obj2 = new RectangleArea();
        obj2.read_input();
        obj1.display();
        obj2.display();
    }
}
