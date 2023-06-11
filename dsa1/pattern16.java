public class pattern16 {
    static void space(int s) {
        if (s == 0) {
            return;
        }
        System.out.print(" ");
        space(s - 1);
    }

    static void print(int rows, int col, int n) {
        if (col == (2 * n - rows)) {
            System.out.println();
            return;
        }
        if (rows == 1 || col == 0 || col == (((2 * n) - (2 * rows - 1)) - 1)) {
            System.out.print("*");
        } else {
            System.out.print(" ");
        }
        print(rows, col + 1, n);
    }

    static void pattern(int rows, int col, int n, int s) {
        if (rows == n + 1) {
            return;
        }
        space(s);
        print(rows, col, n);
        pattern(rows + 1, col, n, s + 1);
    }

    public static void main(String[] args) {
        pattern(1, 0, 5, 0);

    }
}
