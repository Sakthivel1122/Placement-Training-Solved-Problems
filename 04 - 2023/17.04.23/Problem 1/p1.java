public class p1 {
    static int row, col;

    static boolean isInside(int i, int j) {
        if (i >= 0 && j >= 0 && i < row && j < col)
            return true;
        return false;
    }

    static int visit[][] = new int[row][col];

    public static boolean solveThis(int x, int y, char arr[][], String match, int index) {
        if (index >= match.length()) {
            return true;
        }
        if (isInside(x, y)) {
            if (isInside(x, y + 1) && arr[x][y + 1] == match.charAt(index) && visit[x][y + 1] == 0) {
                visit[x][y + 1] = 1;
                if (solveThis(x, y + 1, arr, match, index + 1)) {
                    return true;
                } else {
                    visit[x][y + 1] = 0;
                }
            }
            if (isInside(x + 1, y) && arr[x + 1][y] == match.charAt(index) && visit[x + 1][y] == 0) {
                visit[x + 1][y] = 1;
                if (solveThis(x + 1, y, arr, match, index + 1)) {
                    return true;
                } else {
                    visit[x + 1][y] = 0;
                }
            }
            if (isInside(x, y - 1) && arr[x][y - 1] == match.charAt(index) && visit[x][y - 1] == 0) {
                visit[x][y - 1] = 1;
                if (solveThis(x, y - 1, arr, match, index + 1)) {
                    return true;
                } else {
                    visit[x][y - 1] = 0;
                }
            }
            if (isInside(x - 1, y) && arr[x - 1][y] == match.charAt(index) && visit[x - 1][y] == 0) {
                visit[x - 1][y] = 1;
                if (solveThis(x - 1, y, arr, match, index + 1)) {
                    return true;
                } else {
                    visit[x - 1][y] = 0;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        char arr[][] = {
                { 'A', 'C', 'E', 'E' },
                { 'A', 'B', 'F', 'E' },
                { 'S', 'C', 'E', 'S' },
                { 'A', 'D', 'D', 'E' }
        };
        row = 4;
        col = 4;
        String match = "ABCEE";
        boolean flag = false;
        int index = 0;
        visit = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (arr[i][j] == match.charAt(index)) {
                    visit[i][j] = 1;
                    if (solveThis(i, j, arr, match, index + 1)) {
                        flag = true;
                        break;
                    } else {
                        visit[i][j] = 0;
                        index = 0;
                    }
                }
            }
            if (flag)
                break;
        }
        if (flag)
            System.out.println("True");
        else
            System.out.println("False");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(visit[i][j] + " ");
            }
            System.out.println();
        }
    }
}