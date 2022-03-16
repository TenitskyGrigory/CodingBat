package CodingBat.Warmup1;

public class LastDigit {
    public boolean lastDigit(int a, int b) {
        int x;
        int y;
        x = a%10;
        y = b%10;
        if(x == y) {return true;}
        return false;
    }
}
