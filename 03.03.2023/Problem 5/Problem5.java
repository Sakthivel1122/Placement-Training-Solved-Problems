public class Problem5 {
    public static void main(String[] args) {
        int n = 7;
        int arr[] = new int[n];
        int pos = 0;
        int size = n;
        int temp = n;
        while (temp-- > 1) {
            // Killed
            pos++;
            if (pos >= size)
                pos = 0;
            while (arr[pos] != 0) {
                pos++;
                if (pos >= size)
                    pos = 0;
            }

            arr[pos] = 1;

            // Killer
            pos++;
            if (pos >= size)
                pos = 0;
            while (arr[pos] != 0) {
                pos++;
                if (pos >= size)
                    pos = 0;
            }
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0)
                System.out.println(i + 1);
        }
    }
}
