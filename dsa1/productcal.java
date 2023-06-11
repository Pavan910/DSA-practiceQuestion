public class productcal {
    public static int product(int[] nums) {
        return calpro(nums, 0);
    }

    private static int calpro(int[] nums, int index) {
        if (index == nums.length) {
            return 1;
        }
        int currnum = nums[index];
        return currnum * calpro(nums, index + 1);
    }

    public static void main(String[] args) {
        int[] nums = { 2, 5, 5, 7, 8, 9 };
        int Product = product(nums);
        System.out.println(Product);
    }
}
