public class numbers {
    public static int nums(int num) {
        if (num == 0) {
            return 1;
        } else if (num < 10) {
            return 0;
        } else {
            int p = num % 10;
            int rem = num / 10;
            if (p == 0) {
                return 1 + nums(rem);
            } else {
                return nums(rem);
            }
        }
    }

    public static void main(String[] args) {
        int num = 102030;
        int count = nums(num);
        System.out.println(count);
    }

}
