package String_1;

public class MakeOutWord {
    public String makeOutWord(String out, String word) {
        String a = out.substring(0, 2);
        String b = out.substring(2, 4);
        return a + word + b;
    }
}
