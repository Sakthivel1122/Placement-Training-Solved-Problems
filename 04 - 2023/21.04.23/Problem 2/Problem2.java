import java.util.ArrayList;
import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        scan.nextLine();
        while(size-- > 0){
            list.add(scan.nextLine());
        }
        System.out.println("\nBefore: \n");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+" ");
        }
        System.out.println("\nEnter positions to swap: ");
        int pos1 = scan.nextInt();
        int pos2 = scan.nextInt();
        String temp = list.get(pos1);
        list.set(pos1, list.get(pos2));
        list.set(pos2, temp);
        System.out.println("\nAfter: \n");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        scan.close();
    }
}
