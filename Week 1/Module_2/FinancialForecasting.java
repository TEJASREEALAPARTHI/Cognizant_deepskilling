public class FinancialForecasting {



    // Recursive method to calculate future value

    public static double calculateFutureValue(
            double currentValue,
            double growthRate,
            int years) {


        if (years <= 0) {

            return currentValue;
        }



        return calculateFutureValue(
                currentValue * (1 + growthRate),
                growthRate,
                years - 1
        );
    }







    // Optimized method using formula

    public static double calculateFutureValueOptimized(
            double currentValue,
            double growthRate,
            int years) {


        return currentValue * Math.pow(
                1 + growthRate,
                years
        );
    }







    public static void main(String[] args) {



        double investmentAmount = 5000.0;

        double annualGrowthRate = 0.08;

        int predictionYears = 10;





        System.out.printf(
                "Predicted Future Value: $%.2f%n",
                calculateFutureValue(
                        investmentAmount,
                        annualGrowthRate,
                        predictionYears
                )
        );





        System.out.printf(
                "Optimized Future Value: $%.2f%n",
                calculateFutureValueOptimized(
                        investmentAmount,
                        annualGrowthRate,
                        predictionYears
                )
        );

    }
}