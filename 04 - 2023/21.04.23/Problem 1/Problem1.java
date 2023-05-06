import java.util.ArrayList;
import java.util.Scanner;

public class Problem1 {
    public static boolean isEqual(ArrayList<String> list1,ArrayList<String> list2){
        if(list1.size() != list2.size())
            return false;
        for(int i = 0;i < list1.size();i++){
            if(!list1.get(i).equals(list2.get(i)))
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();

        int size1 = scan.nextInt();
        scan.nextLine();
        while(size1-- > 0){
            list1.add(scan.next());
        }
        int size2 = scan.nextInt();
        scan.nextLine();
        while(size2-- > 0){
            list2.add(scan.next());
        }
        if(isEqual(list1, list2))
            System.out.println("Array List are equal");
        else
            System.out.println("Array List are not equal");
        scan.close();
    }
}
