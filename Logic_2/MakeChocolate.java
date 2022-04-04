package Logic_2;

public class MakeChocolate {
    public int makeChocolate(int small, int big, int goal) {
        int a = goal >= big * 5 ? goal - (big * 5) : goal % 5;
        return a <= small ? a : -1;
    }
}
