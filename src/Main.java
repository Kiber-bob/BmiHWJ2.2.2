public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double bmi = service.calculate(82, 190);
        System.out.println("bmi: " + bmi);
    }
}

