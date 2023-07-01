public class MaxBitwiseAND {
    public static int findMaxBitwiseAND(int[] nums) {
        int maxBitwiseAND = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int bitwiseAND = nums[i] & nums[j];
                if (bitwiseAND > maxBitwiseAND) {
                    maxBitwiseAND = bitwiseAND;
                }
            }
        }

        return maxBitwiseAND;
    }

    public static void main(String[] args) {
        int[] nums = {3, 5, 8, 10, 12};
        int maxBitwiseAND = findMaxBitwiseAND(nums);
        System.out.println("Maximum Bitwise AND: " + maxBitwiseAND);
    }
}
