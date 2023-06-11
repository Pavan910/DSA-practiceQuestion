public class pattern7 {
    static void space(int s) {
        if (s == 0) {
            return;
        }
        System.out.print(" ");
        space(s - 1);
    }

    static void print(int star) {
        if (star == 0) {
            return;
        }
        System.out.print("* ");
        print(star - 1);
    }

    static void pattern(int rows, int col) {
        if (rows == 0) {
            return;
        }
        space(rows - 1);
        print((col - rows) + 1);
        System.out.println();
        pattern(rows - 1, col);
    }

    public static void main(String[] args) {
        pattern(5, 5);
    }
}
