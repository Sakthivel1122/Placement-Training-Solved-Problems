public class Problem3 {
    public static void main(String[] args) {
        int n = 4;
        int height[] = { 4, 1, 4, 10 };
        int width[] = { 6, 2, 5, 12 };
        int length[] = { 7, 3, 6, 32 };
        int h[] = new int[n * 2];
        int base[] = new int[n * 2];
        int index = 0;
        int ans = 0;
        for (int i = 0; i < n; i ++) {
            base[index] =  height[i] * width[i];
            h[index] = length[i];
            index++;
            base[index] = width[i] * length[i];
            h[index] = height[i];
            index++;
        }
        for(int i = 0;i < index;i++){
            System.out.println(base[i]+ " "+ h[i]);
        }
    }
}
