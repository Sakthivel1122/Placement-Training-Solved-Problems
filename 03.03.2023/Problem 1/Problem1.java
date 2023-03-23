import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int ans = 0;
        float mass;
        while(n-- > 0){
            mass = scan.nextInt();
            ans += (mass / 3) -2;
            System.out.println(((int)(mass / 3)) -2);
        }
        System.out.println(ans);
        scan.close();
    }
}
