public class tempConversion {
    private double temp = 0;
    public double celsiusToFahrenheit(double temp){
        this.temp = temp;
        temp = temp * 1.8 + 32.0;
        return temp;
    }
    public double fahrenheitToCelsius(double temp){
        this.temp = temp;
        temp = (temp - 32.0) * 5 / 9;
        return temp;
    }
}
