import java.util.Scanner;
public class Problem1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int currency[] = {2000,500,200,100,50,20,10,5,2,1};
        int num = scan.nextInt();
        while(num != 0){
            for(int i = 0;i < currency.length;i++){
                if(num >= currency[i]){
                    System.out.print(currency[i] + " ");
                    num -= currency[i];
                    break;
                }
            }
        }
        scan.close();
    }
}
