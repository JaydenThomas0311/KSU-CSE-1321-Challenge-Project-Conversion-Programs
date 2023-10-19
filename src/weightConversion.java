public class weightConversion {
    private double weight = 0;
    public double poundsToKilograms(double weight){
        this.weight = weight;
        weight = weight / 2.205;
        return weight;
    }
    public double kilogramsToPounds(double weight){
        this.weight = weight;
        weight = weight * 2.205;
        return weight;
    }
}
