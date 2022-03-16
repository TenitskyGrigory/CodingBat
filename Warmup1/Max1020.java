package CodingBat.Warmup1;

public class Max1020 {
    public int max1020(int a, int b) {
        if((a > 20 | a < 10) & (b >= 10 & b <= 20)) {return b;}
        if((b > 20 | b < 10) & (a >= 10 & a <= 20)) {return a;}
        if((a >= 10 & a <= 20) & (b >= 10 & b <= 20) & (a > b)) {return a;}
        if((a >= 10 & a <= 20) & (b >= 10 & b <= 20) & (a < b)) {return b;}
        return 0;
    }
}
