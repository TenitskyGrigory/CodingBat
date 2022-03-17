package String_1;

public class MiddleTwo {
    public String middleTwo(String str) {
        int middleindex = str.length() / 2;
        String middle = str.substring(middleindex-1, middleindex+1);
        return middle;
    }
}
