package Array_1;

public class Make2 {
    public int[] make2(int[] a, int[] b) {
        int[] newarray = new int[2];
        if(a.length > 1) {
            newarray[0] = a[0];
            newarray[1] = a[1];
            return newarray;
        }
        else if(a.length == 1) {
            newarray[0] = a[0];
            newarray[1] = b[0];
            return newarray;
        }
        newarray[0] = b[0];
        newarray[1] = b[1];
        return newarray;
    }

}
