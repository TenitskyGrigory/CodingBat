package Logic_1;

public class SumLimit {
    public int sumLimit(int a, int b) {
        int c = a + b;
        int lengthC = String.valueOf(c).length();
        int lengthA = String.valueOf(a).length();
        if (lengthC > lengthA) {
            return a;
        }
        return a + b;
    }
}
