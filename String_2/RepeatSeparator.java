package String_2;

public class RepeatSeparator {
    public String repeatSeparator(String word, String sep, int count) {
        if(count == 0) {
            return "";
        }

        StringBuffer newString = new StringBuffer();
        for(int i = 0; i < count - 1; i++) {
            newString.append(word);
            newString.append(sep);
        }
        return newString.append(word).toString();
    }
}
