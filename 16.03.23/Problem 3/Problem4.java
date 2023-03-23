import java.util.Scanner;

class Matrix {
    int row;
    int col;
    int matrix[][] = new int[row][col];
    int verify[][] = new int[row][col];
    Scanner scan = new Scanner(System.in);

    public void getRow() {
        this.row = scan.nextInt();
    }

    public void getCol() {
        this.col = scan.nextInt();
        this.matrix = new int[row][col];
        this.verify = new int[row][col];
    }

    public void setElement(int i, int j) {
        matrix[i][j] = scan.nextInt();
        verify[i][j] = 1;
    }

    public void add() {
        int flag = 1;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (verify[i][j] != 1) {
                    flag = 0;
                    break;
                }
            }
        }
        if (flag == 0)
            System.out.println("Matrices cannot be added");
        else {
            for (int i = 0; i < row; i++, System.out.println()) {
                for (int j = 0; j < col; j++) {
                    System.out.print(matrix[i][j] + matrix[i][j] + " ");
                }
            }
        }
    }

    public void mul() {
        int flag = 1;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (verify[i][j] != 1) {
                    flag = 0;
                    break;
                }
            }
        }
        if (row != col && flag == 0)
            System.out.println("Matrices cannot be multiplied");
        else {
            for (int i = 0; i < row; i++, System.out.println()) {
                for (int j = 0; j < col; j++) {
                    int sum = 0;
                    for (int k = 0; k < col; k++) {
                        sum += matrix[i][k] * matrix[k][j];
                    }
                    System.out.print(sum + " ");
                }
            }
        }
    }
}

public class Problem4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Matrix obj = new Matrix();
        obj.getRow();
        obj.getCol();
        int n = obj.row * obj.col;

        while (n-- > 0) {
            int i = scan.nextInt();
            int j = scan.nextInt();
            obj.setElement(i, j);
        }
        obj.add();
        obj.mul();
        scan.close();
    }
}
