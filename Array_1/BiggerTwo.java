package Array_1;

public class BiggerTwo {
    public int[] biggerTwo(int[] a, int[] b) {
        if(a[0] + a[1] < b[0] + b[1]) {
            return b;
        }
        return a;
    }
}
