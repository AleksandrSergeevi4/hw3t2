public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double growth = 1.77;
        int mass = 105;
        int bmi = service.calculate(growth, mass);
        System.out.println("Ваш индекс BMI:");
        System.out.println(bmi);
    }
}