public class BmiService {

    public int calculate(double growth, int mass) {
        int result = (int) (mass / (growth * growth));
        return result;
    }

}
