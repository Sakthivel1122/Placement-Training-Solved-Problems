import java.util.Arrays;

public class p1 {
    public static void main(String[] args) {
        int n = 3;
        String words[] = { "adc", "wzy", "abc" };
        int size = words.length;
        int difference[][] = new int[size][n - 1];

        for (int i = 0; i < size; i++,System.out.println()) {
            for (int j = 0, t = 0; j < n - 1; j++, t++) {
                difference[i][t] = words[i].charAt(j + 1) - words[i].charAt(j);
                System.out.print(difference[i][t]+" ");
        
            }
        }
        int fin[] = new int[size];
        int count[] = new int[size];
        for (int i = 0; i < size; i++,System.out.println()) {
            for (int j = 0; j < n-1; j++) {
                // System.out.println(i + " "+ j);
                if(difference[i][j] == difference[i+1][j] && difference[i][j+1] == difference[i+1][j+1]){

                }
            }
        }

    }
}
