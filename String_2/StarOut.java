package String_2;

public class StarOut {
    public String starOut(String str) {
        String find = "([a-zA-Z0-9]{0,1})\\*+([a-zA-Z0-9]{0,1})";
        str = str.replaceAll(find, "");
        return str;
    }
}
