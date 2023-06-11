public class pattern {
    static void Printstar(int numofstar) {
        if (numofstar == 0) {
            return;
        }
        System.out.print("*");
        Printstar(numofstar - 1);
    }

    static void printline(int row, int star) {
        if (row == 0) {
            return;
        }
        Printstar(star);
        System.out.println();
        printline(row - 1, star + 1);
    }

    public static void main(String[] args) {
        final int MAX_ROW = 5;
        final int STAR = 1;
        printline(MAX_ROW, STAR);
    }
}