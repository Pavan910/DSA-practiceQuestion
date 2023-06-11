import java.util.Arrays;

public class tax {
    public static double[] salary(double[] num) {
        double[] newsal = new double[num.length];
        salnum(num, newsal, 0);
        return newsal;
    }

    private static void salnum(double[] num, double[] newsal, int index) {
        if (index == num.length) {
            return;
        }
        double salar = num[index];
        double salta = salar + (salar * 0.10);
        newsal[index] = salta;

        salnum(num, newsal, index + 1);

    }

    public static void main(String[] args) {
        double[] num = { 34, 56, 78, 23 };
        double[] taxes = salary(num);
        System.out.println(Arrays.toString(taxes));
    }
}
