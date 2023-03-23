import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str1 = scan.nextLine();
        int arr1[] = new int[26];

        for (int i = 0; i < str1.length(); i++) {
            arr1[str1.charAt(i) - 97]++;
        }
        int arr2[] = new int[26];

        int count = 0;
        for (int i = 0; i < 26; i++) {
            if (arr1[i] != 0)
                arr2[arr1[i]]++;
            if (arr2[arr1[i]] == 1)
                count++;
        }
        int indx[] = new int[2];
        int num[] = new int[2];
        int inx = 0;
        if (count == 2) {
            for (int i = 0; i < 26; i++) {
                if (arr2[i] >= 1) {
                    num[inx] = arr2[i];
                    indx[inx] = i;
                    inx++;
                }
            }
            if (num[0] > num[1]) {
                if (indx[0] > indx[1]) {
                    if (indx[0] - 1 == indx[1])
                        System.out.println("Yes");
                    else
                        System.out.println("No");
                } else {
                    if (indx[1] - 1 == indx[0])
                        System.out.println("Yes");
                    else
                        System.out.println("No");
                }
            } else if (num[1] > num[0]) {
                if (indx[1] > indx[0]) {
                    if (indx[1] - 1 == indx[0])
                        System.out.println("Yes");
                    else
                        System.out.println("No");
                } else {
                    if (indx[0] - 1 == indx[1])
                        System.out.println("Yes");
                    else
                        System.out.println("No");
                }
            } else {
                System.out.println("Yes");
            }
        } else {
            System.out.println("No");
        }
        scan.close();
    }
}
