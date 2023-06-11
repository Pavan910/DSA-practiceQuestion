public class pattern3 {
    static int printStar(int col) {
        if (col == 0) {
            return -1;
        }
        System.out.print("*");
        return printStar(col - 1);
    }

    static void printPattern(int rows, int col) {
        if (rows == 0) {
            return;
        }
        printStar(col - rows + 1);
        System.out.println();
        printPattern(rows - 1, col);
    }

    public static void main(String[] args) {
        printPattern(5, 5);
    }
}
