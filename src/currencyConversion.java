public class currencyConversion {
    private double currency = 0;
    public double dollarsToEuros(double currency){
        this.currency = currency;
        currency *= 0.9452;
        return currency;
    }
    public double eurosToDollars(double currency){
        this.currency = currency;
        currency *= 1.0576;
        return currency;
    }
}
