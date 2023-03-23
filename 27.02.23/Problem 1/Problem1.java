import java.util.Scanner;

class Complex{
    public void sum(int c1[],int c2[]){
        System.out.println("Sum: "+(c1[0] + c2[0]) + " + " + (c1[1] + c2[1]) + "i");
    }
    public void difference(int c1[],int c2[]){
        System.out.println("Diff: "+(c1[0] - c2[0]) + " + " + (c1[1] - c2[1]) + "i");
    }
    public void product(int c1[],int c2[]){
        int r,c;
        r = c1[0] * c2[0];
        c = c1[0] * c2[1];
        c += c1[1] * c2[0];
        r += c1[1] * c2[1] * -1;
        System.out.println("Product: " + r + " + " + c + "i");
    }
}
public class Problem1 {
    public static void main(String[] args) {
        Complex obj = new Complex();
        Scanner scan = new Scanner(System.in);
        int c1[] = new int[2];
        int c2[] = new int[2];
        c1[0] = scan.nextInt();
        c1[1] = scan.nextInt();
        c2[0] = scan.nextInt();
        c2[1] = scan.nextInt();
        obj.sum(c1,c2);
        obj.difference(c1,c2);
        obj.product(c1, c2);
        scan.close();
    }
}