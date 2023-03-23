import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str1 = scan.nextLine();
        String str2 = scan.nextLine();
        // geeks
        // keegs
        int size = str1.length();
        int count = 0;
        char arr1[] = new char[size];
        char arr2[] = new char[size];
        int index = 0;
        for (int i = 0; i < size; i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                count++;
                arr1[index] = str1.charAt(i);
                arr2[index] = str2.charAt(i);
                index++;
            }
        }
        if (count == 2) {
            if (arr1[0] == arr2[1] && arr2[0] == arr1[1]) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        } else {
            System.out.println("No");
        }
        scan.close();
    }
}
