class ParentMatrix {
    public void multi(int arr1[][], int arr2[][]) {
        for (int i = 0; i < arr1.length; i++, System.out.println()) {
            for (int j = 0; j < arr1[0].length; j++) {
                int sum = 0;
                for (int k = 0; k < arr1[0].length; k++) {
                    sum += arr1[i][k] * arr2[k][j];
                }
                System.out.print(sum + " ");
            }
        }
    }
    public void multi(float arr1[][], float arr2[][]) {
        for (int i = 0; i < arr1.length; i++, System.out.println()) {
            for (int j = 0; j < arr1[0].length; j++) {
                float sum = 0;
                for (int k = 0; k < arr1[0].length; k++) {
                    sum += arr1[i][k] * arr2[k][j];
                }
                System.out.print(sum + " ");
            }
        }
    }
}
class Matrix extends ParentMatrix{
    Matrix(int num) {
        System.out.println("Integer: " + num);
    }

    Matrix(float num) {
        System.out.println("Float: " + num);
    }

    public void multi(int arr1[][], int arr2[][]) {
        for (int i = 0; i < arr1.length; i++, System.out.println()) {
            for (int j = 0; j < arr1[0].length; j++) {
                int sum = 0;
                for (int k = 0; k < arr1[0].length; k++) {
                    sum += arr1[i][k] * arr2[k][j];
                }
                System.out.print(sum + " ");
            }
        }
    }

    public void multi(float arr1[][], float arr2[][]) {
        for (int i = 0; i < arr1.length; i++, System.out.println()) {
            for (int j = 0; j < arr1[0].length; j++) {
                float sum = 0;
                for (int k = 0; k < arr1[0].length; k++) {
                    sum += arr1[i][k] * arr2[k][j];
                }
                System.out.print(sum + " ");
            }
        }
    }
}
public class Problem1 {
    public static void main(String[] args) {
        int arr1[][] = {
                { 1, 2, 3 },
                { 4, 5, 6 },
        };
        int arr2[][] = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 1, 3, 5 }
        };
        float arr3[][] = {
                { 1, 2, 3 },
                { 4, 5, 6 },
        };
        float arr4[][] = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 1, 3, 5 }
        };
        // Matrix.multi(arr1, arr2);
        int i_num = 10;
        float f_num = 10.0f;
        Matrix obj1 = new Matrix(f_num); // Constructor Overloading
        System.out.println();
        obj1.multi(arr1, arr2);  // Overloading
        System.out.println();
        obj1.multi(arr3, arr4);
        System.out.println();


        ParentMatrix obj2 = new ParentMatrix();
        obj2.multi(arr1, arr2); // Overridding
        System.out.println();
        obj2.multi(arr3, arr4);
    }
}