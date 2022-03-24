package Array_1;

public class Front11 {
    public int[] front11(int[] a, int[] b) {
        if (a.length < 1 && b.length < 1) {
            int[] newarray = new int[0];
            return newarray;
        }
        else if(a.length < 1) {
            int[] newarray = new int[] {b[0]};
            return newarray;
        }
        else if(b.length < 1) {
            int[] newarray = new int[] {a[0]};
            return newarray;
        }
        int[] newarray = new int[] {a[0], b[0]};
        return newarray;
    }
}
