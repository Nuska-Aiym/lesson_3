public class hw_3 {
    public static void main(String[] args) {
        double[] arr = {8.5, 3.2, -2.7, 1.1, 2.3, 5.5, -1.4, 3.3, -4.6, 2.0, 1.4, 3.5, -5.7, 6.6, 7.7};

        boolean foundNegative = false;
        double positiveSum = 0;
        int positiveCount = 0;

        for (double num : arr) {
            if (!foundNegative && num < 0) {
                foundNegative = true;
            } else if (foundNegative && num > 0) {
                positiveSum += num;
                positiveCount++;
            }
        }

        double averagePositive = positiveCount > 0 ? positiveSum / positiveCount : 0;

        System.out.println("Среднее арифметическое положительных чисел после первого отрицательного: " + averagePositive);
    }
}