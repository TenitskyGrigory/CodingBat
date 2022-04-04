package Logic_2;

public class EvenlySpaced {
    public boolean evenlySpaced(int a, int b, int c) {
        int d;
        if(b > a) {
            d = b;
            b = a;
            a = d;
        }
        if(c > b) {
            d = c;
            c = b;
            b = d;
        }
        if(b > a) {
            d = b;
            b = a;
            a = d;
        }
        return (b - a == c - b);
    }
}
