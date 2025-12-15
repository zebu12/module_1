public class CurrencyConversion {
    public static void main(String[] args) {

        double amountInUSD = 100;
        double exchangeRateUSDToEUR = 0.85;


        System.out.println("Initial amount in USD: " + amountInUSD);

        amountInUSD *= exchangeRateUSDToEUR;
        System.out.println("Amount in EUR: " + amountInUSD);

        amountInUSD -= 55;
        System.out.println("Amount in EUR after expenditure: " + amountInUSD);

        amountInUSD /= exchangeRateUSDToEUR;
        System.out.printf("Amount in USD after converting back: %.2f", amountInUSD);

//        double conversionToEUR = amountInUSD * exchangeRateUSDToEUR;
//        double expenditure = conversionToEUR - 55;
//
//        System.out.println("Amount initial ind USD: " + amountInUSD);
//        System.out.println("Amount in EUR after conversion: " + (amountInUSD *= exchangeRateUSDToEUR));
//        System.out.println("Amount in EUR after expenditure: " + expenditure);
//        System.out.printf("Amount in USD after converting back: %.2f", expenditure /= exchangeRateUSDToEUR);

















    }
}
