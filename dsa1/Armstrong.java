public class Armstrong {
    static boolean nums(int n) {
        int number = n;
        int sum = 0;
        int numdigit = d(n);
        while (n != 0) {
            int digit = number % 10;
            sum += Math.pow(digit, numdigit);
            n /= 10;
        }
        return sum == number;
    }

    public static int d(int n) {
        if (n == 0) {
            return 1;
        } else {
            return 1 + d(n / 10);
        }
    }

    public static void main(String[] args) {
        int n = 153;
        boolean result = nums(n);
        System.out.println("the number is an armstrong number");
    }
}
