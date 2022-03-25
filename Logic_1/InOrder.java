package Logic_1;

public class InOrder {
    public boolean inOrder(int a, int b, int c, boolean bOk) {
        if(a < b && b < c) {
            return true;
        }
        else if (b < c && bOk) {
            return true;
        }
        return false;
    }
}
