public class pattern14 {
    static int print(int num, int col) {
        if (col == 0) {
            return num;
        }
        System.out.print(num + " ");
        return print(num + 1, col - 1);
    }

    static void printPattern(int rows, int num, int col) {
        if (rows == 0) {
            return;
        }
        num = print(num, col);
        System.out.println();
        printPattern(rows - 1, num, col + 1);
    }

    public static void main(String[] args) {
        printPattern(4, 1, 1);
    }
}
