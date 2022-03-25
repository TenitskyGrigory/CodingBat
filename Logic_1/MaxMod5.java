package Logic_1;

public class MaxMod5 {
    public int maxMod5(int a, int b) {
        if(a % 5 == b % 5 && a < b) {
            return a;
        }
        if(a % 5 == b % 5 && a > b) {
            return b;
        }
        if (a > b) {
            return a;
        }
        if (b > a) {
            return b;
        }
        return 0;
    }
}
