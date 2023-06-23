import java.util.Arrays;
import java.util.Scanner;

public class nthlargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 23, 89, 100, 800, 76, 34, 56 };
        int n = sc.nextInt();
        Arrays.sort(arr);
        System.out.println("The nth largest number is " + arr[arr.length - n]);
    }
}
