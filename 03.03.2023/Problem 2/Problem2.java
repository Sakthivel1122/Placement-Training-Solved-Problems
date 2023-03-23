public class Problem2 {
    public static void main(String[] args) {
        int arr[] = { 1, 9, 10, 3, 2, 3, 11, 0, 99, 30, 40, 50 };
        int size = arr.length;
        int op = 0;
        int opcode;
        int pos1, pos2, pos3;
        for(int i = 0;i < size;i++)
        System.out.print(arr[i] + " ");
        System.out.println();
        while (op < size) {
            opcode = arr[op];
            pos1 = op + 1;
            pos2 = op + 2;
            pos3 = op + 3;
            if (opcode == 1) {
                arr[arr[pos3]] = arr[arr[pos1]] + arr[arr[pos2]];
            } else if (opcode == 2) {
                arr[arr[pos3]] = arr[arr[pos1]] * arr[arr[pos2]];
            } else if (opcode == 99)
                break;
            else{
                System.err.println("Wrong");
                break;
            }
            op += 4;
        }
        for(int i = 0;i < size;i++)
        System.out.print(arr[i] + " ");
        System.out.println();
    }
}
