public class search {
    public static boolean s(int[] array, int target) {
        return search(array, target, 0);
    }

    private static boolean search(int[] array, int target, int index) {
        if (index >= array.length) {
            return false;
        }

        if (array[index] == target) {
            return true;
        }

        return search(array, target, index + 1);
    }

    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5 };
        int target = 3;
        if (s(array, target)) {
            System.out.println("Element " + target + " found in the array.");
        } else {
            System.out.println("Element " + target + " not found in the array.");
        }
    }
}
