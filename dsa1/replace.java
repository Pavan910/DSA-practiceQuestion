public class replace {
    public static void s(int[] array, int target, int r) {
        search(array, target, 0, r);
    }

    private static void search(int[] array, int target, int index, int r) {
        if (index >= array.length) {
            return;
        }

        if (array[index] == target) {
            array[index] = r;
        }
        search(array, target, index + 1, r);
    }

    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5 };
        int target = 3;
        int r = 10;
        s(array, target, r);
        for (int element : array) {
            System.out.println(+element);
        }
    }
}
