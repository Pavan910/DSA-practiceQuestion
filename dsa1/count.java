public class count {
    public static int s(int[] array, int target) {
        return search(array, target, 0);
    }

    private static int search(int[] array, int target, int index) {
        if (index >= array.length) {
            return 0;
        }
        int c = search(array, target, index + 1);
        if (array[index] == target) {
            c++;
        }
        return c;
    }

    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 3, 3, 3, 4, 5 };
        int target = 3;
        int c = s(array, target);
        System.out.println("the number of occurrences is" + c);
    }
}
