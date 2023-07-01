public class CountBitwiseAND {
    public static int countBitwiseAND(int n) {
        int count = 0;

        while (n >= 0) {
            if ((n & 1) == 0) {
                count++;
            } else {
                break;
            }
            n >>= 1;
        }

        int numIntegers = (int) Math.pow(2, count);

        return numIntegers;
    }

    public static void main(String[] args) {
        int n = 5;
        int numIntegers = countBitwiseAND(n);
        System.out.println("Number of integers satisfying the condition: " + numIntegers);
    }
}
