package CodingBat.Warmup1;

public class PosNeg {
    public boolean posNeg(int a, int b, boolean negative) {
        if ((a > 0 & b > 0) & negative)  return false;
        else if ((a <= -1 ^ b <= -1) ^ negative)  return true;
        else return false;
    }
}
