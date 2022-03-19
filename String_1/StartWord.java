package String_1;

public class StartWord {
    public String startWord(String str, String word) {
        if(str.startsWith(word)) {
            return word;
        }
        if ((str.length() > 0 & word.length() > 0 & str.length() >= word.length())
                && str.substring(1, word.length()).equals(word.substring(1, word.length()))) {
            return str.substring(0, word.length());
        }
        return "";
    }
}
