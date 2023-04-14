class ThreadAvg extends Thread{
    int arr1[];
    ThreadAvg(int arr2[]){
        int len = arr2.length;
        arr1 = new int[len];
        for(int i = 0;i < len;i++)arr1[i] = arr2[i];
    }
    public void run(){
        double sum = 0;
        for(int i = 0;i < arr1.length;i++)sum += arr1[i];

        System.out.println("Avg: "+sum/(double)arr1.length);
    }
}
class ThreadMax extends Thread{
    int arr1[];
    ThreadMax(int arr2[]){
        int len = arr2.length;
        arr1 = new int[len];
        for(int i = 0;i < len;i++)arr1[i] = arr2[i];
    }
    public void run(){
        int max = Integer.MIN_VALUE;
        for(int i = 0;i < arr1.length;i++){
            if(max < arr1[i])
                max = arr1[i];
        }
        System.out.println("Max: "+max);
    }
}
class ThreadMin extends Thread{
    int arr1[];
    ThreadMin(int arr2[]){
        int len = arr2.length;
        arr1 = new int[len];
        for(int i = 0;i < len;i++)arr1[i] = arr2[i];
    }
    
    public void run(){
        int min = Integer.MAX_VALUE;
        for(int i = 0;i < arr1.length;i++){
            if(min > arr1[i])
                min = arr1[i];
        }
        System.out.println("Min: "+min);
    }
}
public class Problem2 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        ThreadAvg avg = new ThreadAvg(arr);
        ThreadMax max = new ThreadMax(arr);
        ThreadMin min = new ThreadMin(arr);

        avg.start();
        max.start();
        min.start();
    }
}
