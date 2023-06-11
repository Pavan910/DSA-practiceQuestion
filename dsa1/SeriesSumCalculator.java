public class SeriesSumCalculator {
    public static void main(String[] args) {
        int n = 3;
        double sum = calculateSeriesSum(n);
        System.out.println("Sum of the series: " + sum);
    }

    public static double calculateSeriesSum(int n) {
        if (n == 1) {
            return 1.0;
        } else {
            double term = (double) n / Math.pow(n, n);
            return term + calculateSeriesSum(n - 1);
        }
    }
}
