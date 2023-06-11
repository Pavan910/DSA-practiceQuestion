public class pattern4 {
    static int printStar(int col, int rows) {
        if (col == rows) {
            return -1;
        }
        System.out.print("*");
        return printStar(col + 1, rows);
    }

    static void printPattern(int rows, int col) {
        if (rows == 0) {
            return;
        }
        printStar(col, rows);
        System.out.println();
        printPattern(rows - 1, col);
    }

    public static void main(String[] args) {
        printPattern(5, 0);
    }
}
