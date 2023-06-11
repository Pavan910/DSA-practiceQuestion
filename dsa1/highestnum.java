public class highestnum {
    public static int num(int[] nums) {
        return highestnum(nums, 0, Integer.MIN_VALUE);
    }

    private static int highestnum(int[] nums, int index, int highest) {
        if (index == nums.length) {
            return highest;
        }
        if (nums[index] > highest) {
            highest = nums[index];
        }
        return highestnum(nums, index + 1, highest);
    }

    public static void main(String[] args) {
        int[] nums = { 10, 89, 100, 200, 2345 };
        int high = num(nums);
        System.out.println(high);
    }
}
