public class Main {
    public static void main(String[] args) {
        double initialAmount = 10000.0;
        double growthRate = 0.05; // 5%
        int years = 10;

        double result = FinancialForecast.futureValueRecursive(initialAmount, growthRate, years);
        System.out.println("Future value after " + years + " years: ₹" + result);

        // Using memoization
        double[] memo = new double[years + 1];
        double optimizedResult = FinancialForecast.futureValueMemoized(initialAmount, growthRate, years, memo);
        System.out.println("Memoized future value after " + years + " years: ₹" + optimizedResult);
    }
}
