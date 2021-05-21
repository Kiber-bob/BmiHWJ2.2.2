public class BmiService {
    public double calculate(double mass, double hight) {
        double bmi;
        bmi = mass / (hight * hight);
        return bmi;
    }
}
