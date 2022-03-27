package Logic_2;

public class RoundSum {
    public int roundSum(int a, int b, int c) {
        return round10(a) + round10(b) + round10(c);
    }
    public int round10(int n) {
        int d = n % 10;
        int e = n - d;
        if(d >= 5) {
            return e + 10;
        }
        return e;
    }
}
