public class pattern19 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 3; i <= n; i++) {
            for (int j = 0; j < n + 1 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i - 1; k++) {
                System.out.print("*");
            }
            for (int j = 0; j < 2 * n - (2 * i - 1); j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        n = n * 2;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (n * 2 - (2 * i - 1)); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
