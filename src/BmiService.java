public class BmiService {
    public double calculate(double mass, double hight) {
        double bmi;
        bmi = mass / (hight * 2);
        return bmi;
    }
}
