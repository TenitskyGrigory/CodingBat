package CodingBat.Warmup1;

public class MonkeyTrouble {
    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if(aSmile ^ bSmile == false) {
            return true;
        }
        return false;
    }
}
