import java.util.Scanner;

public class p3 {
    public static void sortDesc(char chars[], int counts[]) {
        int n = chars.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (counts[i] < counts[j]) {
                    int temp = counts[i];
                    counts[i] = counts[j];
                    counts[j] = temp;
                    char ch = chars[i];
                    chars[i] = chars[j];
                    chars[j] = ch;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int d = scan.nextInt();
        int size = str.length();
        String elements = "";
        for (int i = 0; i < size; i++) {
            if (!elements.contains(str.charAt(i) + "")) {
                elements += str.charAt(i);
            }
        }
        char chars[] = elements.toCharArray();
        int counts[] = new int[elements.length()];
        for (int i = 0; i < elements.length(); i++) {
            int count = 0;
            for (int j = 0; j < size; j++) {
                if (chars[i] == str.charAt(j))
                    count++;
            }
            counts[i] = count;
        }
        int n = chars.length;
        if (d <= elements.length()) {
            sortDesc(chars, counts);
            boolean flag = true;
            while (flag) {
                sortDesc(chars, counts);
                for (int i = 0; i < n - 1; i++) {
                    if (counts[i] == counts[i + 1]) {
                        if (chars[i] > chars[i + 1]) {
                            char ch = chars[i];
                            chars[i] = chars[i + 1];
                            chars[i + 1] = ch;
                        }
                    }
                }
                for (int i = 0; i < d; i++) {
                    if (counts[i] == 0) {
                        flag = false;
                        break;
                    }
                    System.out.print(chars[i]);
                    counts[i]--;
                }
            }
        } else
            System.out.println(" Cannot be rearranged ");
        scan.close();
    }
}
