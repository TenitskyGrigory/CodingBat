package Logic_1;

public class NearTen {
    public boolean nearTen(int num) {
        int newvalue = num % 10;
        if (newvalue <= 2 || newvalue >= 8) {
            return true;
        }
        return false;
    }
}
