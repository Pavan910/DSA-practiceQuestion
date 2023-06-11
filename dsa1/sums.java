public class sums {
    static int sum(int s) {
        if (s == 0) {
            return 0;
        } else if (s == 1) {
            return 1;
        } else {
            return (s * (s + 1)) / 2;
        }
    }

    public static void main(String[] args) {
        int s = 100;
        int result = sum(s);
        System.out.println(result);
    }
}
