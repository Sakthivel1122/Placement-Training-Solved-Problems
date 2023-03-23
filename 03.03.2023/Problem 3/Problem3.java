public class Problem3 {
    public static void main(String[] args) {
        // int arr[] = {1, 2, 3, 1, 4, 5, 2, 3, 6};
        // int k = 3;
        int arr[] = {8, 5, 10, 7, 9, 4, 15, 12, 90, 13};
        int k = 4;
        int size = arr.length;
        for(int i = 0;i < size;i++){
            int max = Integer.MIN_VALUE;
            if((i + k) <= size){
                for(int j = i;j < i+k;j++){
                    if(max < arr[j])
                        max = arr[j];
                }
                System.out.print(max+" ");
            }
            else
                break;
        }
    }
}