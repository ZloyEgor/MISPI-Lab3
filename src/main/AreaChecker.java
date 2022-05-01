public class AreaChecker {
    public static boolean checkArea(double x, double y, double r) {
        //2 квадрант
        if (x <= 0 && y >= 0) {
            return Math.pow(x, 2) + Math.pow(y, 2) <= Math.pow(r / 2, 2);
        }
        //3 квадрант
        if (x <= 0 && y <= 0) {
            return (y >= -2 * x - r);
        }
        //4 квадрант
        if (x >= 0 && y <= 0) {
            return (x <= r / 2 && y >= -r);
        }
        //1 квадрант
        return false;
    }
}
