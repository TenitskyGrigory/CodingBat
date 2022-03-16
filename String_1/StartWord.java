package CodingBat.String_1;

public class StartWord {
    public String startWord(String str, String word) {
        int n = word.length();
        if (str.length() < word.length()) {
            return "";
        }
        String front = str.substring(0,n);
        if(word.equals(front)) {
            return front;
        }
        String a = str.substring(1, n);
        String b = word.substring(1, word.length());
        if(a.equals(b)) {
            return front;
        }
        return "";
    }
}
