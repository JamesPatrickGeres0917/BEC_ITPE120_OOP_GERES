public class MathOperations {
    public static double calculateAverage(double[] numbers) {
        if (numbers.length == 0) {
            return 0.0;
        }

        double sum = 0.0;
        for (double number : numbers) {
            sum += number;
        }

        return sum / numbers.length;
    }

    public static void main(String[] args) {
        double[] values = { 12.5, 7.2, 3.8, 9.4, 11.1 };
        double average = MathOperations.calculateAverage(values);
        System.out.println("Average: " + average);
    }
}