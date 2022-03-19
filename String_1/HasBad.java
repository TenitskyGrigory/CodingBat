package String_1;

public class HasBad {
    public boolean hasBad(String str) {
        return (str.startsWith("bad") || str.startsWith("bad", 1));
    }
}
