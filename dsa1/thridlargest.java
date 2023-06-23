import java.util.Arrays;

public class thridlargest {
    public static void main(String[] args) {
        int arr[] = { 23, 89, 100, 800, 76, 34, 56 };
        Arrays.sort(arr);
        System.out.println(arr[arr.length - 3]);
    }
}
