package String_2;

public class OneTwo {
    public String oneTwo(String str) {
        String newString = "";
        for(int i = 0; i < str.length() - 2; i += 3) {
            newString = newString + str.substring(i+1, i+3) + str.charAt(i);
        }
        return newString;
    }
}
