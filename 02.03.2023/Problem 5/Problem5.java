import java.util.concurrent.CountDownLatch;

// Trapping Rain Water Problem

public class Problem5 {
    public static void main(String[] args) {
        int arr[] = {7, 0, 4, 2, 5, 0, 6, 4, 0, 5};
        int max = arr[0];
        int size = arr.length;
        for(int i = 1;i < size;i++){
            if(max < arr[i])max = arr[i];
        }
        int tank[][] = new int[max][size];
        int row = max;
        int col = size;
        for(int j = 0;j < col;j++){
            int height = arr[j];
            for(int i = row-1;i >= 0;i--){
                if(height > 0){
                    tank[i][j] = 1;
                }
                else
                    break;
                height--;
            }
        }
        for(int i = 0;i < row;i++,System.out.println()){
            for(int j = 0;j < col;j++){
                System.out.print(tank[i][j]+" ");
            }
        }
        int ans = 0;
        for(int i = 0;i < row;i++){
            int count = 0;
            for(int j = 0;j < col;j++){
                if(tank[i][j] == 0)
                    count++;
                else{
                    ans += count;
                    count = 0;
                }
            }
        }
        System.out.println(ans);
    }
}
