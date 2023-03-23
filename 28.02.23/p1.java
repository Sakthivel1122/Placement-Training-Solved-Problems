import java.util.Arrays;

public class p1 {
    public static void main(String[] args) {
        int arr[] = {3,4,5,1,2};
        int del = arr[0];
        int arr2[] = new int[arr.length-1];
        for(int i = 1;i < arr.length;i++){
            arr2[i-1] = arr[i];
        }
        for (int i : arr2)System.out.print(i + " ");
        System.out.println("\n"+del);
        Arrays.sort(arr2);
        for (int i : arr2)System.out.print(i + " ");
    }
}
