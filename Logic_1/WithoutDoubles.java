package Logic_1;

public class WithoutDoubles {
    public int withoutDoubles(int die1, int die2, boolean noDoubles) {
        if ((die1 != die2) || (die1 == die2 && !noDoubles)) {
            return die1 + die2;
        }
        if(die1 == 6){
            die1 = 1;
            return die1 + die2;
        }
        return die1 + die2 + 1;
    }
}
