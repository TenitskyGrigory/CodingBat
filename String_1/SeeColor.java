package String_1;

public class SeeColor {
    public String seeColor(String str) {
        if(str.startsWith("red", 0)) {
            return "red";
        }
        if(str.startsWith("blue", 0)) {
            return "blue";
        }
        return "";
    }
}
