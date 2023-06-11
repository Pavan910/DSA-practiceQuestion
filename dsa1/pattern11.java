public class pattern11 {
    static int printStar(int col, int rows, int n) {
        if (col == n) {
            return -1;
        }
        if (rows == col || (rows + col) == n - 1) {
            System.out.print("*");
        } else {
            System.out.print(" ");
        }
        return printStar(col + 1, rows, n);
    }

    static void printPattern(int rows, int n) {
        if (rows == n) {
            return;
        }
        printStar(0, rows, n);
        System.out.println();
        printPattern(rows + 1, n);
    }

    public static void main(String[] args) {
        printPattern(0, 5);
    }
}
