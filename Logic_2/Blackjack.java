package Logic_2;

public class Blackjack {
    public int blackjack(int a, int b) {
        if(isCloseTo21(a) < isCloseTo21(b)) {
            return b;
        }
        else if (isCloseTo21(a) > isCloseTo21(b)) {
            return a;
        }
        return 0;
    }

    public int isCloseTo21(int n) {
        if(21 - n >= 0) {
            return n;
        }
        return 0;
    }
}
