package Logic_2;

public class CloseFar {
    public boolean closeFar(int a, int b, int c) {
        return (isClose(a, b) && isFar(a, b, c)) || (isClose(a, c) && isFar(a, c, b));
    }
    public boolean isClose(int i, int j) {
        return Math.abs(i - j) <= 1;
    }
    public boolean isFar(int i, int j, int k) {
        return Math.abs(i - k) >= 2 && Math.abs(j - k) >= 2;
    }
}
