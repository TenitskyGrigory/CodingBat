package String_1;

public class MakeTags {
    public String makeTags(String tag, String word) {
        String a = "<" + tag + ">";
        String b = "</" + tag + ">";
        return a + word + b;
    }
}
