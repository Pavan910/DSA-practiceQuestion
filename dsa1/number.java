public class number {
    static int[] num(int nums, int pos) {
        if (nums == 0) {
            int result[] = new int[2];
            return result;
        }
        int arr[] = num(nums / 10, pos + 1);
        int digit = nums % 10;
        if (pos % 2 != 0) {
            arr[0] = arr[0] + digit;
        } else {
            arr[1] = arr[1] + digit;
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = num(2789, 0);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
    }
}