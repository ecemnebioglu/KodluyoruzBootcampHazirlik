public class Main {
    public static void main(String[] args) {
        double[] list = {1.0, 2.0, 3.0, 4.0, 5.0};
        double harmonicSeries = 0.0;
        for (double i : list) {
            harmonicSeries += 1.0 / i;
        }
        double harmonicMean = list.length / harmonicSeries;
        System.out.println(harmonicMean);
    }
}
